package com.hiberbee.settings

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.util.xmlb.XmlSerializerUtil.copyBean
import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable

@State(name = "ThemeSettings", storages = [(Storage("hiberbee.xml"))])
class ThemeSettings : PersistentStateComponent<ThemeSettings> {
  /**
   * default value
   */
  var isThemeEnabled = true

  @Nullable
  override fun getState() = this

  override fun loadState(@NotNull state: ThemeSettings) {
    copyBean(state, this)
  }

  companion object {
    val instance: ThemeSettings
      get() = ApplicationManager.getApplication().getService(ThemeSettings::class.java)
  }
}
