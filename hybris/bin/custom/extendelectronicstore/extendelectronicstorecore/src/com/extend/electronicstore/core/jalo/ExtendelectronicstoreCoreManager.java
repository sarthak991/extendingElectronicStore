/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.extend.electronicstore.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.extend.electronicstore.core.constants.ExtendelectronicstoreCoreConstants;
import com.extend.electronicstore.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class ExtendelectronicstoreCoreManager extends GeneratedExtendelectronicstoreCoreManager
{
	public static final ExtendelectronicstoreCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ExtendelectronicstoreCoreManager) em.getExtension(ExtendelectronicstoreCoreConstants.EXTENSIONNAME);
	}
}
