package com.gupaoedu.vip.spring.formework.webmvc.servlet;

import java.util.Locale;
import java.io.File;

/**
 * Created by yzy
 */
public class GPViewResolver {

    private final String DEFAULT_TEMPLATE_SUFFX = ".html";

    private File templateRootDir;

    public GPViewResolver(String templateRoot) {
        String templateRootPath = this.getClass().getClassLoader().getResource(templateRoot).getFile();
        templateRootDir = new File(templateRootPath);
    }

    public GPView resolveViewName(String viewName, Locale locale) throws Exception{
        if(null == viewName || "".equals(viewName.trim())){return null;}
        viewName = viewName.endsWith(DEFAULT_TEMPLATE_SUFFX) ? viewName : (viewName + DEFAULT_TEMPLATE_SUFFX);
        File templateFile = new File((templateRootDir.getPath() + "/" + viewName).replaceAll("/+","/"));
        return new GPView(templateFile);
    }

}
