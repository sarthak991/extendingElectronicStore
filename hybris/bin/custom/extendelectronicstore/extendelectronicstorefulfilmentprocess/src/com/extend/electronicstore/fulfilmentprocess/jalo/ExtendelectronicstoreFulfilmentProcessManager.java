/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.extend.electronicstore.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.extend.electronicstore.fulfilmentprocess.constants.ExtendelectronicstoreFulfilmentProcessConstants;

public class ExtendelectronicstoreFulfilmentProcessManager extends GeneratedExtendelectronicstoreFulfilmentProcessManager
{
	public static final ExtendelectronicstoreFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ExtendelectronicstoreFulfilmentProcessManager) em.getExtension(ExtendelectronicstoreFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
