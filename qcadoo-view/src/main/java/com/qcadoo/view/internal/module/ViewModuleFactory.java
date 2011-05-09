package com.qcadoo.view.internal.module;

import org.jdom.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;

import com.qcadoo.plugin.api.ModuleFactory;
import com.qcadoo.view.internal.api.InternalViewDefinitionService;
import com.qcadoo.view.internal.xml.ViewDefinitionParser;

public class ViewModuleFactory extends ModuleFactory<ViewModule> {

    @Autowired
    private ViewDefinitionParser viewDefinitionParser;

    @Autowired
    private InternalViewDefinitionService viewDefinitionService;

    @Override
    public ViewModule parse(final String pluginIdentifier, final Element element) {
        String resource = getRequiredAttribute(element, "resource");

        return new ViewModule(pluginIdentifier, new ClassPathResource(pluginIdentifier + "/" + resource), viewDefinitionParser,
                viewDefinitionService);
    }

    @Override
    public String getIdentifier() {
        return "view";
    }

}
