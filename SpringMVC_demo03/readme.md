# 域对象共享数据
1、使用ServletAPI向request域对象共享数据
2、使用ServletContext域对象共享数据
3、使用Listener监听器向域对象共享数据
```java
@RequestMapping("/testServletAPI")
public String testServletAPI(HttpServletRequest request){
    request.setAttribute("testScope", "hello,servletAPI");
    return "success";
}
```
2、使用ModelAndView向request域对象共享数据
```java
@RequestMapping("/testModelAndView")
public ModelAndView testModelAndView(){
    /**
     * ModelAndView有Model和View的功能
     * Model主要用于向请求域共享数据
     * View主要用于设置视图，实现页面跳转
     */
    ModelAndView mav = new ModelAndView();
    //向请求域共享数据
    mav.addObject("testScope", "hello,ModelAndView");
    //设置视图，实现页面跳转
    mav.setViewName("success");
    return mav;
}
```
3、使用Model向request域对象共享数据
```java
@RequestMapping("/testModel")
public String testModel(Model model){
    model.addAttribute("testScope", "hello,Model");
    return "success";
}
```
4、使用map向request域对象共享数据
```java
@RequestMapping("/testMap")
public String testMap(Map<String, Object> map){
    map.put("testScope", "hello,Map");
    return "success";
}
```
5、使用ModelMap向request域对象共享数据
```java
RequestMapping("/testModelMap")
public String testModelMap(ModelMap modelMap){
    modelMap.addAttribute("testScope", "hello,ModelMap");
    return "success";
}
```
6、Model、ModelMap、Map的关系
Model、ModelMap、Map类型的参数，底层其实都是Map。
```java
public interface Model{}
public class ModelMap extends LinkedHashMap<String, Object> {}
public class ExtendedModelMap extends ModelMap implements Model {}
public class BindingAwareModelMap extends ExtendedModelMap {}
```
7、向session域对象共享数据
```java
@RequestMapping("/testSession")
public String testSession(HttpSession session){
    session.setAttribute("testSessionScope", "hello,session");
    return "success";
}
```
8、向application域对象共享数据
```java
@RequestMapping("/testSession")
public String testSession(HttpSession session){
    session.setAttribute("testSessionScope", "hello,session");
    return "success";
}
```
9、使用Listener监听器向域对象共享数据
创建监听器，实现HttpSessionAttributeListener接口，监听session对象属性的添加、替换、移除
```java
public class SessionAttributeListener implements HttpSessionAttributeListener {
@Override}
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("session域对象添加属性:" + event.getName() + " = " + event.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("session域对象移除属性:" + event.getName() + " = " + event.getValue());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("session域对象替换属性:" + event.getName() + " = " + event.getValue());
    }
}
```