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

package com.hiberbee.jetbrains.notifications


import com.hiberbee.jetbrains.ThemeMeta
import com.intellij.ide.BrowserUtil
import com.intellij.notification.Notification
import com.intellij.notification.NotificationAction
import com.intellij.notification.NotificationGroupManager
import com.intellij.notification.NotificationType
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.IconLoader
import org.intellij.lang.annotations.Language

object ThemeNotification {

  @Language("HTML")
  private val whatsNew = """
        <ul>
            <li>Added notifications with release notes</li>
        </ul>
    """.trimIndent()

  @Language("HTML")
  private val releaseNote = """
        <p>What's New?</p>
        $whatsNew
    """.trimIndent()

  @Language("HTML")
  private val welcomeMessage = """
        <p>Thank you for choosing Hiberbee theme.</p>
    """.trimIndent()

  private const val notificationGroupId = "Hiberbee Theme"

  @JvmField
  val notificationIcon = IconLoader.getIcon("/META-INF/pluginIcon.svg", javaClass)

  private const val changelogLink = "https://github.com/hiberbee/themes/blob/latest/CHANGELOG.md"
  private const val githubRepoLink = "https://github.com/hiberbee/themes"

  fun notifyReleaseNote(project: Project) {
    val title = "Hiberbee Theme updated to v${ThemeMeta.currentVersion}"
    val notification = NotificationGroupManager.getInstance().getNotificationGroup(notificationGroupId)
      .createNotification(title, releaseNote, NotificationType.INFORMATION)
    addNotificationActions(notification)
    notification.icon = notificationIcon
    notification.notify(project)
  }

  fun notifyFirstlyDownloaded(project: Project) {
    val title = "Hiberbee Theme is installed"
    val notification = NotificationGroupManager.getInstance().getNotificationGroup(notificationGroupId)
      .createNotification(title, welcomeMessage, NotificationType.INFORMATION)
    addNotificationActions(notification)
    notification.icon = notificationIcon
    notification.notify(project)
  }

  private fun addNotificationActions(notification: Notification) {
    val actionChangelog = NotificationAction.createSimple("Changelog") {
      BrowserUtil.browse(changelogLink)
    }
    val actionGithubRepo = NotificationAction.createSimple("GitHub") {
      BrowserUtil.browse(githubRepoLink)
    }
    notification.addAction(actionChangelog)
    notification.addAction(actionGithubRepo)
  }

}
