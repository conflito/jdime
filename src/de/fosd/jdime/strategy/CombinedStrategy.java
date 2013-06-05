/*******************************************************************************
 * Copyright (c) 2013 Olaf Lessenich.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     Olaf Lessenich - initial API and implementation
 ******************************************************************************/
/**
 * 
 */
package de.fosd.jdime.strategy;

import de.fosd.jdime.common.FileArtifact;
import de.fosd.jdime.common.MergeContext;
import de.fosd.jdime.common.NotYetImplementedException;
import de.fosd.jdime.common.operations.MergeOperation;

/**
 * Performs a structured merge with auto-tuning.
 * 
 * @author Olaf Lessenich
 * 
 */
public class CombinedStrategy extends MergeStrategy<FileArtifact> {

	/**
	 * Logger.
	 */
	// private static final Logger LOG = Logger.getLogger(Combined.class);
	
	/* (non-Javadoc)
	 * @see de.fosd.jdime.strategy.MergeInterface#merge(
	 * de.fosd.jdime.common.operations.MergeOperation, 
	 * de.fosd.jdime.common.MergeContext)
	 */
	@Override
	public final void merge(final MergeOperation<FileArtifact> operation,
			final MergeContext context) {
		// TODO Auto-generated method stub

		throw new NotYetImplementedException(
				"Combined Strategy: Implement me!");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fosd.jdime.strategy.MergeStrategy#toString()
	 */
	@Override
	public final String toString() {
		return "combined";
	}

}