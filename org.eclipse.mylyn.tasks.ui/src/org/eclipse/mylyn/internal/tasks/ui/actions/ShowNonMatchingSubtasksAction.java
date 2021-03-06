/*******************************************************************************
 * Copyright (c) 2011 Tasktop Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tasktop Technologies - initial API and implementation
 *******************************************************************************/

package org.eclipse.mylyn.internal.tasks.ui.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.mylyn.internal.tasks.ui.ITasksUiPreferenceConstants;
import org.eclipse.mylyn.internal.tasks.ui.TasksUiPlugin;

/**
 * @author Steffen Pingel
 */
public class ShowNonMatchingSubtasksAction extends Action {

	public ShowNonMatchingSubtasksAction() {
		setText(Messages.ShowNonMatchingSubtasksAction_Show_Non_Matching_Subtasks);
		setToolTipText(Messages.ShowNonMatchingSubtasksAction_Show_Non_Matching_Subtasks);
		setChecked(!TasksUiPlugin.getDefault()
				.getPreferenceStore()
				.getBoolean(ITasksUiPreferenceConstants.FILTER_NON_MATCHING));
	}

	@Override
	public void run() {
		TasksUiPlugin.getDefault()
				.getPreferenceStore()
				.setValue(ITasksUiPreferenceConstants.FILTER_NON_MATCHING, !isChecked());
	}

}
