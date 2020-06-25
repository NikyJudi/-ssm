//package com.nk.config;
//
//import org.springframework.web.servlet.HandlerInterceptor;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//public class LoginInterceptor implements HandlerInterceptor {
//    /**
//     * Controller类方法调用前，如果匹配到拦截器的url，就会调用preHandle进行处理
//     * @param request
//     * @param response
//     * @param handler
//     * @return true能够继续访问（可以调用Controller中的方法，或是访问某个页面）
//     * @throws Exception
//     */
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        HttpSession session = request.getSession();//获取session，如果没有，返回null
//        System.out.println("Handle session:"+session);
//        if(session != null){
//            Object user = session.getAttribute("user");
//            System.out.println("handleuser:"+user);
//            if(user != null){
//                return true;
//            }
//        }
//            response.sendRedirect("/");
//        return true;
//    }
////
////    private static ConcurrentHashMap<String, Long> map = new ConcurrentHashMap<>();
////    @Override
////    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
////        HandlerMethod handlerMethod = (HandlerMethod) handler;
////        RequestMapping requestMapping = handlerMethod.getMethodAnnotation(RequestMapping.class);
////        if (requestMapping != null) {
////            String url = requestMapping.value()[0];
////            Long num = map.getOrDefault(url, 0L);
////            map.put(url, num + 1);
////        }
////    }
//}
