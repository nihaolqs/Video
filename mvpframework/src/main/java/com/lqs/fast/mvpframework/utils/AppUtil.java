package com.lqs.fast.mvpframework.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.FileProvider;
import android.webkit.MimeTypeMap;
import android.widget.Toast;

import java.io.File;
import java.util.List;

/**
 * Created by dell on 2016/10/19.
 */

public final class AppUtil {

    private AppUtil() {
    }

    /**
     * 通过包名检查应用是否安装
     * @param context
     * @param packageName 包名
     * @return 是否安装
     */
    public static boolean checkApkInstalled(Context context, String packageName) {
        final PackageManager packageManager = context.getPackageManager();
        List<PackageInfo> pinfo = packageManager.getInstalledPackages(0);
        if (pinfo != null) {
            for (int i = 0; i < pinfo.size(); i++) {
                String pn = pinfo.get(i).packageName;
                if (pn.equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 通过包名启动App
     * @param context
     * @param appPackageName
     */
    public static void startAPk(Context context, String appPackageName) {
        try {
            Intent intent = context.getPackageManager().getLaunchIntentForPackage(appPackageName);
            context.startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(context, "没有安装", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * 安装APP的方法(兼容7.0+)
     * @param context
     * @param filePath
     * @param fileProvider
     */
    public static void installApk(Context context, String filePath, String fileProvider) {

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        File file = new File(filePath);
        if (Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
            Uri contentUri = FileProvider.getUriForFile(context, fileProvider, file);
//            Uri contentUri = FileProvider.getUriForFile(context, "com.lqs.fast.gamestore.fileProvider", file);
            intent.setDataAndType(contentUri, "application/vnd.android.package-archive");
        } else {
            intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
        }
        context.startActivity(intent);
    }

    /**
     * 通过包名卸载应用
     * @param context
     * @param packageName
     */
    public static void unInstallApk(Context context, String packageName) {
        Uri uri = Uri.parse("package:" + packageName);

        Intent intent = new Intent(Intent.ACTION_DELETE, uri);
        context.startActivity(intent);
    }

    /**
     * 通过file调用适配应用打开文件
     * @param file
     * @param context
     */
    public static void openFile(File file, Context context) {
        Intent var2 = new Intent();
        var2.addFlags(268435456);
        var2.setAction("android.intent.action.VIEW");
        String var3 = getMIMEType(file);
        var2.setDataAndType(Uri.fromFile(file), var3);
        try {
            context.startActivity(var2);
        } catch (Exception var5) {
            var5.printStackTrace();
            Toast.makeText(context, "没有找到打开此类文件的程序", Toast.LENGTH_SHORT).show();
        }
    }

    public static String getMIMEType(File file) {
        String mineType = "";
        String fileName = file.getName();
        String var3 = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()).toLowerCase();
        mineType = MimeTypeMap.getSingleton().getMimeTypeFromExtension(var3);
        return mineType;
    }
}
