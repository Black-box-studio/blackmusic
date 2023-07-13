package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.Log;

import io.flutter.embedding.engine.FlutterEngine;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  private static final String TAG = "GeneratedPluginRegistrant";
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    try {
      flutterEngine.getPlugins().add(new com.llfbandit.app_links.AppLinksPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin app_links, com.llfbandit.app_links.AppLinksPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.ryanheise.audioservice.AudioServicePlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin audio_service, com.ryanheise.audioservice.AudioServicePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.ryanheise.audio_session.AudioSessionPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin audio_session, com.ryanheise.audio_session.AudioSessionPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.nicolorebaioli.audiotagger.AudiotaggerPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin audiotagger, com.nicolorebaioli.audiotagger.AudiotaggerPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new dev.fluttercommunity.plus.connectivity.ConnectivityPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.mr.flutter.plugin.filepicker.FilePickerPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin file_picker, com.mr.flutter.plugin.filepicker.FilePickerPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.kineapps.flutterarchive.FlutterArchivePlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin flutter_archive, com.kineapps.flutterarchive.FlutterArchivePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.ajinasokan.flutterdisplaymode.DisplayModePlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin flutter_displaymode, com.ajinasokan.flutterdisplaymode.DisplayModePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new es.antonborri.home_widget.HomeWidgetPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin home_widget, es.antonborri.home_widget.HomeWidgetPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.ryanheise.just_audio.JustAudioPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin just_audio, com.ryanheise.just_audio.JustAudioPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.lucasjosino.on_audio_query.OnAudioQueryPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin on_audio_query_android, com.lucasjosino.on_audio_query.OnAudioQueryPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.pathprovider.PathProviderPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.baseflow.permissionhandler.PermissionHandlerPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.kasem.receive_sharing_intent.ReceiveSharingIntentPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin receive_sharing_intent, com.kasem.receive_sharing_intent.ReceiveSharingIntentPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new dev.fluttercommunity.plus.share.SharePlusPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.tekartik.sqflite.SqflitePlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.urllauncher.UrlLauncherPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new be.tramckrijte.workmanager.WorkmanagerPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin workmanager, be.tramckrijte.workmanager.WorkmanagerPlugin", e);
    }
  }
}
