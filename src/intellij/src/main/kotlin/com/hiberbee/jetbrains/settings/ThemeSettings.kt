package com.hiberbee.jetbrains.settings

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage

@State(name = "HiberbeeTheme", storages = [Storage("hiberbee-theme.xml")])
class ThemeSettings : PersistentStateComponent<ThemeState> {

  companion object {
    val instance: ThemeSettings
      get() = ApplicationManager.getApplication().getService(ThemeSettings::class.java)
  }

  private var myState = ThemeState()

  var version: String
    get() = myState.version
    set(value) {
      myState.version = value
    }

  var accentColor: String
    get() = myState.accentColor
    set(value) {
      myState.accentColor = value
    }

  override fun getState(): ThemeState {
    return myState
  }

  override fun loadState(state: ThemeState) {
    myState = state
  }

}
