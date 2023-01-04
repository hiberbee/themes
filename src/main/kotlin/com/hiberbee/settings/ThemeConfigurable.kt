/*
 * MIT License
 *
 * Copyright (c) 2020 Hiberbee
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.hiberbee.settings

import com.intellij.openapi.options.ConfigurationException
import com.intellij.openapi.options.SearchableConfigurable
import org.jetbrains.annotations.Nls
import javax.swing.JComponent

class ThemeConfigurable : SearchableConfigurable {
  private var settingsForm: ThemeSettingsForm? = null

  override fun createComponent(): JComponent? {
    settingsForm = settingsForm ?: ThemeSettingsForm()
    return settingsForm?.component()
  }

  override fun isModified(): Boolean {
    return settingsForm?.isModified() ?: return false
  }

  @Throws(ConfigurationException::class)
  override fun apply() {
    val settings = ThemeSettings.instance
    settings.isThemeEnabled =  true
  }

  override fun reset() {
    settingsForm?.loadSettings()
  }

  override fun disposeUIResources() {
    settingsForm = null
  }

  @Nls
  override fun getDisplayName() = "Hiberbee Theme"

  override fun getId(): String = ID

  companion object {
    const val ID = "preferences.hiberbee.theme"
  }
}
