package org.lpdql.automation.autoedit;

import java.awt.Event;
import java.lang.Thread.State;
import java.net.URL;

import javax.annotation.Resource;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.report.resolution.ResolutionReport;
import org.eclipse.ui.handlers.HandlerUtil;
import org.lpdql.automation.Automation;

public class AutoEditHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getActiveWorkbenchWindowChecked(event).getActivePage();
		for (Object o : selection.toArray()) {
			if (o instanceof IFile) {
				IFile file = (IFile) o;
				ResourceSet rs = new ResourceSetImpl();
				URI uri = URI.createURI(file.getLocationURI().toString());
				Resource r = (Resource) rs.getResource(uri, false);
				
				// new edite the model
//				Automation automation = (Automation) r.getContents().get(0);
				
				// add 2 States
				
			}
		}
		return null;
	}

}
