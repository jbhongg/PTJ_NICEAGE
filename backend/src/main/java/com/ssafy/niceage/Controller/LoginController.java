package com.ssafy.niceage.Controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.niceage.Controller.Request.UserRequest;
import com.ssafy.niceage.Domain.User.User;
import com.ssafy.niceage.Service.JwtService;
import com.ssafy.niceage.Service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;

@Api
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {
	private final JwtService jwtService;
    private final UserService userService;
    
    public static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    @ApiOperation(value = "로그인",response = ResponseEntity.class)
    @PostMapping
    public ResponseEntity<Map<String, Object>> login(@ApiParam(value = "회원 정보") @RequestBody UserRequest userRequest,
                                                     HttpServletResponse response,
                                                     HttpSession session){
        Map<String, Object> resultMap = new HashMap<>();
        HttpStatus status = null;
        try{
            User loginUser = userService.findByIdAndPassword(userRequest.getUserId(), userRequest.getUserPassword());
            if(loginUser!=null){
                User userInfo = userService.findById(userRequest.getUserId());
                String token = jwtService.create(loginUser);
                logger.trace("로그인 토큰정보 : {}", token);
                response.setHeader("auth_token", token);
                resultMap.put("auth_token",token);
                resultMap.put("status", true);
                resultMap.put("user", userInfo);
                resultMap.put("message", "login success");
            }
            else{
                loginUser = userService.findById(userRequest.getUserId());
                if(loginUser != null){
                    resultMap.put("message", "로그인 실패 : 비밀번호가 틀렸습니다.");
                }else{
                    resultMap.put("message", "로그인 실패 : 존재하지 않는 아이디입니다.");
                }
            }
            status = HttpStatus.ACCEPTED;
        }catch(Exception e){
            logger.error("로그인 실패 : {}", e);
            resultMap.put("message", e.getMessage());
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<Map<String, Object>>(resultMap, status);
    }
}
