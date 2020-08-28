package io.github.frame.prj.freemaker;

import freemarker.template.TemplateModelException;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

/**
 * @author Created by 思伟 on 2020/8/28
 */
@Component
public class SelectTag extends SimpleTemplateDirectiveModel {

    @Override
    public String getTagName() {
        return "select";
    }

    @Override
    protected boolean requireBody() {
        return super.requireBody();
    }

    @Override
    protected void render(Writer out, Map params) throws TemplateModelException, IOException {

    }

}
