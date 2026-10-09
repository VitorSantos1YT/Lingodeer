package bq;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.MediaMetadataRetriever;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import b0.k2;
import b7.e0;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.billing.Subscription2Activity;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fb.g0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements tx.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f4953a = new m();

    public static long A(int i11) {
        System.currentTimeMillis();
        Uri uri = Uri.parse("android.resource://com.lingodeer/" + i11);
        int i12 = 0;
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            kotlin.jvm.internal.m.c(lingoSkillApplication);
            mediaMetadataRetriever.setDataSource(lingoSkillApplication, uri);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            if (strExtractMetadata == null) {
                strExtractMetadata = "0";
            }
            mediaMetadataRetriever.release();
            i12 = (int) (Integer.parseInt(strExtractMetadata) / 1.0f);
            System.currentTimeMillis();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return i12;
    }

    public static long B(String path) {
        kotlin.jvm.internal.m.f(path, "path");
        System.currentTimeMillis();
        int i11 = 0;
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(path);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            if (strExtractMetadata == null) {
                strExtractMetadata = "0";
            }
            mediaMetadataRetriever.release();
            i11 = (int) (Integer.parseInt(strExtractMetadata) / 1.0f);
            System.currentTimeMillis();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return i11;
    }

    public static void C(Context context, String source) {
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(source, "source");
        int i11 = Subscription2Activity.K;
        context.startActivity(g0.u(context, source));
    }

    public static void D(Context context, String str) {
        kotlin.jvm.internal.m.f(context, "context");
        C(context, str);
    }

    public static void E(Activity activity) {
        kotlin.jvm.internal.m.f(activity, "activity");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        kotlin.jvm.internal.m.c(lingoSkillApplication);
        Object systemService = lingoSkillApplication.getSystemService("input_method");
        kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
    }

    public static boolean F() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        return cf.x.n().keyLanguage == 0 || cf.x.n().keyLanguage == 11 || cf.x.n().keyLanguage == 1 || cf.x.n().keyLanguage == 2 || cf.x.n().keyLanguage == 13 || cf.x.n().keyLanguage == 12;
    }

    public static boolean G() {
        try {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            kotlin.jvm.internal.m.c(lingoSkillApplication);
            Object systemService = lingoSkillApplication.getSystemService("connectivity");
            kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean H() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        return (cf.x.n().keyLanguage == 12 || cf.x.n().keyLanguage == 13 || cf.x.n().keyLanguage == 11 || cf.x.n().keyLanguage == 14 || cf.x.n().keyLanguage == 15 || cf.x.n().keyLanguage == 16 || cf.x.n().keyLanguage == 17 || cf.x.n().keyLanguage == 22 || cf.x.n().keyLanguage == 40 || cf.x.n().keyLanguage == 48 || cf.x.n().keyLanguage == 50 || cf.x.n().keyLanguage == 54 || cf.x.n().keyLanguage == 55) ? false : true;
    }

    public static void I(EditText editText) {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (ry.l.D(new Integer[]{1, 12}, Integer.valueOf(cf.x.n().keyLanguage))) {
            editText.setTextLocale(Locale.JAPAN);
        } else if (ry.l.D(new Integer[]{0, 11}, Integer.valueOf(cf.x.n().keyLanguage))) {
            editText.setTextLocale(Locale.SIMPLIFIED_CHINESE);
        }
    }

    public static void J(TextView textView) {
        kotlin.jvm.internal.m.f(textView, "textView");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (ry.l.D(new Integer[]{1, 12}, Integer.valueOf(cf.x.n().keyLanguage))) {
            textView.setTextLocale(Locale.JAPAN);
        } else if (ry.l.D(new Integer[]{0, 11}, Integer.valueOf(cf.x.n().keyLanguage))) {
            textView.setTextLocale(Locale.SIMPLIFIED_CHINESE);
        }
    }

    public static void K() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = cf.x.n().themeValue;
        if (i11 == 0) {
            androidx.appcompat.app.a.l(1);
        } else if (i11 == 1) {
            androidx.appcompat.app.a.l(2);
        } else {
            if (i11 != 2) {
                return;
            }
            androidx.appcompat.app.a.l(-1);
        }
    }

    public static void L(String context, String fileName) {
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(fileName, "fileName");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        kotlin.jvm.internal.m.c(lingoSkillApplication);
        File file = new File(lingoSkillApplication.getFilesDir(), "alphabet");
        if (!file.exists()) {
            file.mkdirs();
        }
        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
        kotlin.jvm.internal.m.c(lingoSkillApplication2);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(ep.a.D(lingoSkillApplication2.getFilesDir().getPath(), "/alphabet/", fileName));
            try {
                Charset charsetForName = Charset.forName(Constants.ENCODING);
                kotlin.jvm.internal.m.e(charsetForName, "forName(...)");
                byte[] bytes = context.getBytes(charsetForName);
                kotlin.jvm.internal.m.e(bytes, "getBytes(...)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ns.o.m(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static void a(Context context, String content) {
        kotlin.jvm.internal.m.f(content, "content");
        Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(content, content));
    }

    public static List b() {
        List list = r.f4980w;
        List list2 = (List) list.get(LingoSkillApplication.H);
        int i11 = LingoSkillApplication.H + 1;
        LingoSkillApplication.H = i11;
        if (i11 >= list.size()) {
            LingoSkillApplication.H = 0;
        }
        return list2;
    }

    public static String c() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = cf.x.n().keyLanguage;
        if (i11 == 0) {
            return "CHN";
        }
        if (i11 == 1) {
            return "JPN";
        }
        if (i11 == 2) {
            return "KRN";
        }
        if (i11 == 4) {
            return "SPN";
        }
        if (i11 == 5) {
            return "FRN";
        }
        if (i11 != 47) {
            return i11 != 53 ? "KRN" : "FRN";
        }
        return "SPN";
    }

    public static String d() {
        try {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            kotlin.jvm.internal.m.c(lingoSkillApplication);
            PackageManager packageManager = lingoSkillApplication.getPackageManager();
            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
            kotlin.jvm.internal.m.c(lingoSkillApplication2);
            String str = packageManager.getPackageInfo(lingoSkillApplication2.getPackageName(), 0).versionName;
            return str != null ? str : BuildConfig.VERSION_NAME;
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    public static int e(String str) {
        Matcher matcher = Pattern.compile(".+?_([0-9]+?)\\.db").matcher(str);
        if (matcher.matches()) {
            return Integer.parseInt(matcher.group(1));
        }
        return -1;
    }

    public static String[] f(int i11) {
        if (i11 == 51) {
            return r.f4979v;
        }
        switch (i11) {
            case 1:
                return r.f4974q;
            case 2:
                return r.f4975r;
            case 3:
                return r.f4970l;
            case 4:
                return r.m;
            case 5:
                return r.f4971n;
            case 6:
                return r.f4972o;
            case 7:
                return r.f4976s;
            case 8:
                return r.f4973p;
            case 9:
                return r.f4977t;
            case 10:
                return r.f4978u;
            default:
                return r.f4970l;
        }
    }

    public static String g(int i11) {
        if (i11 == 40) {
            return "itoc";
        }
        if (i11 == 57) {
            return "thai";
        }
        if (i11 == 61) {
            return "hindi";
        }
        if (i11 == 63) {
            return "ukr";
        }
        if (i11 == 65) {
            return "grk";
        }
        if (i11 == 69) {
            return "mal";
        }
        switch (i11) {
            case 0:
                return "cn";
            case 1:
                return "jp";
            case 2:
                return "kr";
            case 3:
                return "en";
            case 4:
                return "esoc";
            case 5:
                return "froc";
            case 6:
                return "deoc";
            case 7:
                return "vt";
            case 8:
                return "ptoc";
            default:
                switch (i11) {
                    case 10:
                    case 22:
                        return "ruoc";
                    case 11:
                        return "cnup";
                    case 12:
                        return "jpup";
                    case 13:
                        return "krup";
                    case 14:
                        return "esoc";
                    case 15:
                        return "froc";
                    case 16:
                        return "deoc";
                    case 17:
                        return "ptoc";
                    case 18:
                        return "idn";
                    case 19:
                        return "pol";
                    case 20:
                        return "itoc";
                    case 21:
                        return "tur";
                    default:
                        switch (i11) {
                            case 47:
                            case 48:
                                return "esus";
                            case 49:
                            case 50:
                                return "enes";
                            case 51:
                                return "ara";
                            default:
                                switch (i11) {
                                    case 53:
                                    case 54:
                                        return "frus";
                                    case 55:
                                        return "ara";
                                    default:
                                        return BuildConfig.VERSION_NAME;
                                }
                        }
                }
        }
    }

    public static String h(int i11) {
        if (i11 == 40) {
            return "it";
        }
        if (i11 == 57) {
            return "thai";
        }
        if (i11 == 61) {
            return "hindi";
        }
        if (i11 == 63) {
            return "ukr";
        }
        if (i11 == 65) {
            return "grk";
        }
        if (i11 == 69) {
            return "mal";
        }
        switch (i11) {
            case 0:
            case 11:
                return "cn";
            case 1:
            case 12:
                return "jp";
            case 2:
            case 13:
                return "kr";
            case 3:
                return "en";
            case 4:
            case 14:
                return "es";
            case 5:
            case 15:
                return "fr";
            case 6:
            case 16:
                return "de";
            case 7:
                return "vt";
            case 8:
            case 17:
                return "pt";
            case 9:
                return "tch";
            case 10:
            case 22:
                return "ru";
            case 18:
                return "idn";
            case 19:
                return "pol";
            case 20:
                return "it";
            case 21:
                return "tur";
            default:
                switch (i11) {
                    case 47:
                    case 48:
                        return "esus";
                    case 49:
                    case 50:
                        return "enes";
                    case 51:
                        return "ara";
                    default:
                        switch (i11) {
                            case 53:
                            case 54:
                                return "frus";
                            case 55:
                                return "ara";
                            default:
                                return BuildConfig.VERSION_NAME;
                        }
                }
        }
    }

    public static String i(int i11) {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (cf.x.n().fluentLanguage != -1) {
            return h(i11).concat(":fl");
        }
        if (cf.x.n().scLanguage != -1) {
            return h(i11).concat(":tv");
        }
        if (cf.x.n().handWriteLanguage != -1) {
            return h(i11).concat(":cr");
        }
        return !H() ? h(i11).concat(":lv_2") : h(i11).concat(":lv_1");
    }

    public static String k(int i11) {
        if (i11 == 0) {
            return "cn";
        }
        if (i11 == 1) {
            return "jp";
        }
        if (i11 == 2) {
            return "kr";
        }
        if (i11 == 4) {
            return "es";
        }
        if (i11 == 5 || i11 == 15 || i11 == 53) {
            return "fr";
        }
        if (i11 == 47 || i11 == 48) {
            return "es";
        }
        switch (i11) {
            case 11:
                return "cn";
            case 12:
                return "jp";
            case 13:
                return "kr";
            default:
                return BuildConfig.VERSION_NAME;
        }
    }

    public static String l(int i11, long j11) {
        return e0.k(j11, k(i11), "-");
    }

    public static boolean m() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (cf.x.n().keyLanguage == 0 || cf.x.n().keyLanguage == 1 || cf.x.n().keyLanguage == 2 || cf.x.n().keyLanguage == 7) {
            return true;
        }
        if (cf.x.n().keyLanguage == 11 || cf.x.n().keyLanguage == 12 || cf.x.n().keyLanguage == 13 || (((cf.x.n().keyLanguage == 4 || cf.x.n().keyLanguage == 5 || cf.x.n().keyLanguage == 6 || cf.x.n().keyLanguage == 14 || cf.x.n().keyLanguage == 15 || cf.x.n().keyLanguage == 16 || cf.x.n().keyLanguage == 10 || cf.x.n().keyLanguage == 22 || cf.x.n().keyLanguage == 20 || cf.x.n().keyLanguage == 40 || cf.x.n().keyLanguage == 47 || cf.x.n().keyLanguage == 48 || cf.x.n().keyLanguage == 53 || cf.x.n().keyLanguage == 54 || cf.x.n().keyLanguage == 8 || cf.x.n().keyLanguage == 17 || cf.x.n().keyLanguage == 51 || cf.x.n().keyLanguage == 55 || cf.x.n().keyLanguage == 57 || cf.x.n().keyLanguage == 21 || cf.x.n().keyLanguage == 61 || cf.x.n().keyLanguage == 63 || cf.x.n().keyLanguage == 65 || cf.x.n().keyLanguage == 18 || cf.x.n().keyLanguage == 69 || cf.x.n().keyLanguage == 19) && cf.x.n().locateLanguage == 3) || ((ry.l.D(new Integer[]{5, 15, 57}, Integer.valueOf(cf.x.n().keyLanguage)) && ry.l.D(new Integer[]{9, 2, 1}, Integer.valueOf(cf.x.n().locateLanguage))) || ((ry.l.D(new Integer[]{53, 54, 47, 48}, Integer.valueOf(cf.x.n().keyLanguage)) && ry.l.D(new Integer[]{6, 5, 9, 1, 2}, Integer.valueOf(cf.x.n().locateLanguage))) || ((ry.l.D(new Integer[]{4, 14}, Integer.valueOf(cf.x.n().keyLanguage)) && ry.l.D(new Integer[]{2, 9, 57}, Integer.valueOf(cf.x.n().locateLanguage))) || ((ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage)) && ry.l.D(new Integer[]{9}, Integer.valueOf(cf.x.n().locateLanguage))) || ((ry.l.D(new Integer[]{6, 16}, Integer.valueOf(cf.x.n().keyLanguage)) && ry.l.D(new Integer[]{9, 2, 21}, Integer.valueOf(cf.x.n().locateLanguage))) || ((ry.l.D(new Integer[]{10, 22}, Integer.valueOf(cf.x.n().keyLanguage)) && ry.l.D(new Integer[]{9, 21, 6}, Integer.valueOf(cf.x.n().locateLanguage))) || (cf.x.n().keyLanguage == 8 && ry.l.D(new Integer[]{9, 1}, Integer.valueOf(cf.x.n().locateLanguage))))))))))) {
            return true;
        }
        return cf.x.n().keyLanguage == 3 && ry.l.D(new Integer[]{51, 6, 4, 5, 18, 20, 1, 2, 19, 8, 10, 21, 7, 0, 9}, Integer.valueOf(cf.x.n().locateLanguage));
    }

    public static String n(String jsonFilePath) throws IOException {
        kotlin.jvm.internal.m.f(jsonFilePath, "jsonFilePath");
        FileInputStream fileInputStream = new FileInputStream(new File(jsonFilePath));
        byte[] bArr = new byte[fileInputStream.available()];
        fileInputStream.read(bArr);
        fileInputStream.close();
        Charset charsetForName = Charset.forName(Constants.ENCODING);
        kotlin.jvm.internal.m.e(charsetForName, "forName(...)");
        return new String(bArr, charsetForName);
    }

    public static String o(Context context) {
        kotlin.jvm.internal.m.f(context, "context");
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.lingodeer", 64).signatures;
            if (signatureArr == null) {
                return BuildConfig.VERSION_NAME;
            }
            Signature signature = signatureArr.length == 0 ? null : signatureArr[0];
            if (signature == null) {
                return BuildConfig.VERSION_NAME;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(signature.toByteArray());
            byte[] bArrDigest = messageDigest.digest();
            kotlin.jvm.internal.m.c(bArrDigest);
            String strA0 = ry.l.a0(bArrDigest, ":", new k2(28), 30);
            return strA0 == null ? BuildConfig.VERSION_NAME : strA0;
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    public static Locale p() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (cf.x.n().keyLanguage == 21) {
            return new Locale("tr");
        }
        if (cf.x.n().keyLanguage == 7) {
            return new Locale("vt");
        }
        return cf.x.n().keyLanguage == 61 ? new Locale("hi") : new Locale("en");
    }

    public static String q(int i11) {
        if (i11 == 0) {
            return "cn";
        }
        if (i11 == 40) {
            return "it";
        }
        if (i11 == 61) {
            return "hindi";
        }
        if (i11 == 63) {
            return "ukr";
        }
        if (i11 == 65) {
            return "grk";
        }
        if (i11 == 69) {
            return "mal";
        }
        switch (i11) {
            case 2:
                return "kr";
            case 3:
                return "en";
            case 4:
                return "es";
            case 5:
                return "fr";
            case 6:
                return "de";
            case 7:
                return "vt";
            case 8:
                return "pt";
            case 9:
                return "tch";
            case 10:
                return "ru";
            case 11:
                return "cn";
            default:
                switch (i11) {
                    case 13:
                        return "kr";
                    case 14:
                        return "es";
                    case 15:
                        return "fr";
                    case 16:
                        return "de";
                    case 17:
                        return "pt";
                    case 18:
                        return "idn";
                    case 19:
                        return "pol";
                    case 20:
                        return "it";
                    case 21:
                        return "tur";
                    case 22:
                        return "ru";
                    default:
                        switch (i11) {
                            case 47:
                            case 48:
                                return "es";
                            case 49:
                            case 50:
                                return "en";
                            case 51:
                                return "ara";
                            default:
                                switch (i11) {
                                    case 53:
                                    case 54:
                                        return "fr";
                                    case 55:
                                        return "ara";
                                    default:
                                        return "jp";
                                }
                        }
                }
        }
    }

    public static String s(Context context, int i11) {
        kotlin.jvm.internal.m.f(context, "context");
        if (i11 == 40) {
            return ff.h.y(context, R.string.italy).concat(" 2");
        }
        if (i11 == 57) {
            return ff.h.y(context, R.string.thai);
        }
        if (i11 == 61) {
            return ff.h.y(context, R.string.hindi);
        }
        if (i11 == 63) {
            return ff.h.y(context, R.string.ukr);
        }
        if (i11 == 65) {
            return ff.h.y(context, R.string.grk);
        }
        if (i11 == 69) {
            return ff.h.y(context, R.string.malay);
        }
        switch (i11) {
            case 0:
                return ff.h.y(context, R.string.chinese);
            case 1:
                return ff.h.y(context, R.string.japanese);
            case 2:
                return ff.h.y(context, R.string.korean);
            case 3:
                return ff.h.y(context, R.string.english);
            case 4:
                return ff.h.y(context, R.string.spanish);
            case 5:
                return ff.h.y(context, R.string.french_normal);
            case 6:
                return ff.h.y(context, R.string.german);
            case 7:
                return ff.h.y(context, R.string.vietnamese);
            case 8:
                return ff.h.y(context, R.string.portuguese);
            case 9:
                return ff.h.y(context, R.string.chinese);
            case 10:
                return ff.h.y(context, R.string.russian);
            case 11:
                return ff.h.y(context, R.string.chinese).concat(" 2");
            case 12:
                return ff.h.y(context, R.string.japanese).concat(" 2");
            case 13:
                return ff.h.y(context, R.string.korean).concat(" 2");
            case 14:
                return ff.h.y(context, R.string.spanish).concat(" 2");
            case 15:
                return ff.h.y(context, R.string.french_normal).concat(" 2");
            case 16:
                return ff.h.y(context, R.string.german).concat(" 2");
            case 17:
                return ff.h.y(context, R.string.portuguese).concat(" 2");
            case 18:
                return ff.h.y(context, R.string.indonesia);
            case 19:
                return ff.h.y(context, R.string.polish);
            case 20:
                return ff.h.y(context, R.string.italy);
            case 21:
                return ff.h.y(context, R.string.turkish);
            case 22:
                return ff.h.y(context, R.string.russian).concat(" 2");
            default:
                switch (i11) {
                    case 47:
                        return ff.h.y(context, R.string.spanish_us);
                    case 48:
                        return ff.h.y(context, R.string.spanish_us).concat(" 2");
                    case 49:
                        return ff.h.y(context, R.string.english_es);
                    case 50:
                        return ff.h.y(context, R.string.english_es).concat(" 2");
                    case 51:
                        return ff.h.y(context, R.string.arabic);
                    default:
                        switch (i11) {
                            case 53:
                                return ff.h.y(context, R.string.french_accelerated);
                            case 54:
                                return ff.h.y(context, R.string.french_accelerated).concat(" 2");
                            case 55:
                                return ff.h.y(context, R.string.arabic).concat(" 2");
                            default:
                                return BuildConfig.VERSION_NAME;
                        }
                }
        }
    }

    public static int u(int i11) {
        if (i11 != 20) {
            if (i11 == 22) {
                return 10;
            }
            if (i11 != 40) {
                switch (i11) {
                    case 0:
                        return 0;
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                    case 3:
                        return 3;
                    case 4:
                        return 4;
                    case 5:
                        return 5;
                    case 6:
                        return 6;
                    case 7:
                        return 7;
                    case 8:
                        return 8;
                    default:
                        switch (i11) {
                            case 10:
                                return 10;
                            case 11:
                                return 0;
                            case 12:
                                return 1;
                            case 13:
                                return 2;
                            case 14:
                                return 4;
                            case 15:
                                return 5;
                            case 16:
                                return 6;
                            case 17:
                                return 8;
                            default:
                                switch (i11) {
                                    case 47:
                                    case 48:
                                        return 47;
                                    case 49:
                                    case 50:
                                        return 49;
                                    case 51:
                                        return 51;
                                    default:
                                        switch (i11) {
                                            case 53:
                                            case 54:
                                                return 53;
                                            case 55:
                                                return 51;
                                            default:
                                                return i11;
                                        }
                                }
                        }
                }
            }
        }
        return 20;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:148:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:172:0x0306  */
    /* JADX WARN: Code duplicated, block: B:176:0x0317  */
    /* JADX WARN: Code duplicated, block: B:180:0x0327  */
    /* JADX WARN: Code duplicated, block: B:188:0x0347  */
    /* JADX WARN: Code duplicated, block: B:196:0x0367  */
    /* JADX WARN: Code duplicated, block: B:200:0x0378  */
    /* JADX WARN: Code duplicated, block: B:208:0x039a  */
    /* JADX WARN: Code duplicated, block: B:216:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:225:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:228:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:319:0x0550  */
    /* JADX WARN: Code duplicated, block: B:42:0x0119 A[PHI: r21 r22 r24 r25 r26
      0x0119: PHI (r21v4 java.lang.Object) = 
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v2 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
      (r21v0 java.lang.Object)
     binds: [B:41:0x0116, B:222:0x03da, B:218:0x03c9, B:214:0x03b8, B:210:0x03a7, B:206:0x0396, B:202:0x0385, B:198:0x0374, B:194:0x0363, B:190:0x0353, B:186:0x0343, B:182:0x0333, B:178:0x0323, B:174:0x0313, B:170:0x0302, B:166:0x02f2, B:162:0x02e2, B:158:0x02d1, B:154:0x02c2, B:150:0x02b2, B:146:0x02a1, B:142:0x0290, B:138:0x027f, B:134:0x026e, B:131:0x025b, B:127:0x0246, B:123:0x023a, B:120:0x0227, B:116:0x0212, B:112:0x01fd, B:108:0x01f1, B:105:0x01e7, B:101:0x01d8, B:98:0x01d0, B:95:0x01c6, B:91:0x01b7, B:88:0x01af, B:85:0x01a5, B:81:0x0197, B:78:0x0190, B:74:0x0181, B:70:0x0174, B:67:0x016d, B:64:0x0164, B:60:0x0159, B:57:0x0150, B:53:0x0143, B:49:0x0136, B:44:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r22v4 java.lang.Object) = 
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v2 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
      (r22v0 java.lang.Object)
     binds: [B:41:0x0116, B:222:0x03da, B:218:0x03c9, B:214:0x03b8, B:210:0x03a7, B:206:0x0396, B:202:0x0385, B:198:0x0374, B:194:0x0363, B:190:0x0353, B:186:0x0343, B:182:0x0333, B:178:0x0323, B:174:0x0313, B:170:0x0302, B:166:0x02f2, B:162:0x02e2, B:158:0x02d1, B:154:0x02c2, B:150:0x02b2, B:146:0x02a1, B:142:0x0290, B:138:0x027f, B:134:0x026e, B:131:0x025b, B:127:0x0246, B:123:0x023a, B:120:0x0227, B:116:0x0212, B:112:0x01fd, B:108:0x01f1, B:105:0x01e7, B:101:0x01d8, B:98:0x01d0, B:95:0x01c6, B:91:0x01b7, B:88:0x01af, B:85:0x01a5, B:81:0x0197, B:78:0x0190, B:74:0x0181, B:70:0x0174, B:67:0x016d, B:64:0x0164, B:60:0x0159, B:57:0x0150, B:53:0x0143, B:49:0x0136, B:44:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r24v4 java.lang.Object) = 
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v2 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
      (r24v0 java.lang.Object)
     binds: [B:41:0x0116, B:222:0x03da, B:218:0x03c9, B:214:0x03b8, B:210:0x03a7, B:206:0x0396, B:202:0x0385, B:198:0x0374, B:194:0x0363, B:190:0x0353, B:186:0x0343, B:182:0x0333, B:178:0x0323, B:174:0x0313, B:170:0x0302, B:166:0x02f2, B:162:0x02e2, B:158:0x02d1, B:154:0x02c2, B:150:0x02b2, B:146:0x02a1, B:142:0x0290, B:138:0x027f, B:134:0x026e, B:131:0x025b, B:127:0x0246, B:123:0x023a, B:120:0x0227, B:116:0x0212, B:112:0x01fd, B:108:0x01f1, B:105:0x01e7, B:101:0x01d8, B:98:0x01d0, B:95:0x01c6, B:91:0x01b7, B:88:0x01af, B:85:0x01a5, B:81:0x0197, B:78:0x0190, B:74:0x0181, B:70:0x0174, B:67:0x016d, B:64:0x0164, B:60:0x0159, B:57:0x0150, B:53:0x0143, B:49:0x0136, B:44:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r25v4 java.lang.Object) = 
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v2 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
      (r25v0 java.lang.Object)
     binds: [B:41:0x0116, B:222:0x03da, B:218:0x03c9, B:214:0x03b8, B:210:0x03a7, B:206:0x0396, B:202:0x0385, B:198:0x0374, B:194:0x0363, B:190:0x0353, B:186:0x0343, B:182:0x0333, B:178:0x0323, B:174:0x0313, B:170:0x0302, B:166:0x02f2, B:162:0x02e2, B:158:0x02d1, B:154:0x02c2, B:150:0x02b2, B:146:0x02a1, B:142:0x0290, B:138:0x027f, B:134:0x026e, B:131:0x025b, B:127:0x0246, B:123:0x023a, B:120:0x0227, B:116:0x0212, B:112:0x01fd, B:108:0x01f1, B:105:0x01e7, B:101:0x01d8, B:98:0x01d0, B:95:0x01c6, B:91:0x01b7, B:88:0x01af, B:85:0x01a5, B:81:0x0197, B:78:0x0190, B:74:0x0181, B:70:0x0174, B:67:0x016d, B:64:0x0164, B:60:0x0159, B:57:0x0150, B:53:0x0143, B:49:0x0136, B:44:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r26v4 java.lang.Object) = 
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v2 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
      (r26v0 java.lang.Object)
     binds: [B:41:0x0116, B:222:0x03da, B:218:0x03c9, B:214:0x03b8, B:210:0x03a7, B:206:0x0396, B:202:0x0385, B:198:0x0374, B:194:0x0363, B:190:0x0353, B:186:0x0343, B:182:0x0333, B:178:0x0323, B:174:0x0313, B:170:0x0302, B:166:0x02f2, B:162:0x02e2, B:158:0x02d1, B:154:0x02c2, B:150:0x02b2, B:146:0x02a1, B:142:0x0290, B:138:0x027f, B:134:0x026e, B:131:0x025b, B:127:0x0246, B:123:0x023a, B:120:0x0227, B:116:0x0212, B:112:0x01fd, B:108:0x01f1, B:105:0x01e7, B:101:0x01d8, B:98:0x01d0, B:95:0x01c6, B:91:0x01b7, B:88:0x01af, B:85:0x01a5, B:81:0x0197, B:78:0x0190, B:74:0x0181, B:70:0x0174, B:67:0x016d, B:64:0x0164, B:60:0x0159, B:57:0x0150, B:53:0x0143, B:49:0x0136, B:44:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x015c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static LanguageItem v(Context context, String learningLan) {
        List listK;
        List listT;
        List listK2;
        kotlin.jvm.internal.m.f(learningLan, "learningLan");
        if (TextUtils.isEmpty(learningLan)) {
            return null;
        }
        int i11 = 0;
        String str = ":";
        Matcher matcherW = nv.p.w(0, ":", "compile(...)", learningLan);
        char c11 = '\n';
        if (matcherW.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = nv.p.c(matcherW, learningLan, iC, arrayList);
            } while (matcherW.find());
            nv.p.B(iC, learningLan, arrayList);
            listK = arrayList;
        } else {
            listK = ns.o.K(learningLan.toString());
        }
        boolean zIsEmpty = listK.isEmpty();
        List listT2 = ry.r.f50854a;
        int i12 = 1;
        if (zIsEmpty) {
            listT = listT2;
            break;
        }
        ListIterator listIterator = listK.listIterator(listK.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                listT = listT2;
                break;
            }
            if (((String) listIterator.previous()).length() != 0) {
                listT = e0.t(listIterator, 1, listK);
                break;
            }
        }
        char c12 = 2;
        if (listT.toArray(new String[0]).length < 2) {
            return null;
        }
        LanguageItem languageItem = new LanguageItem();
        Matcher matcherW2 = nv.p.w(0, ":", "compile(...)", learningLan);
        if (matcherW2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iC2 = 0;
            while (true) {
                iC2 = nv.p.c(matcherW2, learningLan, iC2, arrayList2);
                if (!matcherW2.find()) {
                    break;
                }
                c11 = c11;
                i11 = i11;
                i12 = i12;
                c12 = c12;
                str = str;
            }
            nv.p.B(iC2, learningLan, arrayList2);
            listK2 = arrayList2;
        } else {
            listK2 = ns.o.K(learningLan.toString());
        }
        if (!listK2.isEmpty()) {
            ListIterator listIterator2 = listK2.listIterator(listK2.size());
            while (listIterator2.hasPrevious()) {
                if (((String) listIterator2.previous()).length() != 0) {
                    listT2 = e0.t(listIterator2, i12, listK2);
                    break;
                }
            }
        }
        String[] strArr = (String[]) listT2.toArray(new String[i11]);
        String str2 = strArr[i11];
        String str3 = strArr[i12];
        String strQ0 = oz.x.q0(str2, "oc", BuildConfig.VERSION_NAME);
        String str4 = str;
        Object obj = "mal";
        Object obj2 = "pol";
        Object obj3 = "tur";
        Object obj4 = "ukr";
        Object obj5 = "cnup";
        switch (strQ0.hashCode()) {
            case -1335370896:
                if (!strQ0.equals("deocup")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(16);
                }
                break;
            case -1298712590:
                if (!strQ0.equals("enesup")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(50);
                }
                break;
            case -1293812451:
                if (!strQ0.equals("esocup")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(14);
                }
                break;
            case -1293618329:
                if (!strQ0.equals("esusup")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(48);
                }
                break;
            case -1266106821:
                if (!strQ0.equals("frocup")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(15);
                }
                break;
            case -1265912699:
                if (!strQ0.equals("frusup")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(54);
                }
                break;
            case -977968269:
                if (!strQ0.equals("ptocup")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(17);
                }
                break;
            case -919786446:
                if (!strQ0.equals("ruocup")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(22);
                }
                break;
            case 3179:
                if (!strQ0.equals("cn")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(0);
                }
                break;
            case 3201:
                if (!strQ0.equals("de")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(6);
                }
                break;
            case 3241:
                if (!strQ0.equals("en")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(3);
                }
                break;
            case 3246:
                if (!strQ0.equals("es")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(4);
                }
                break;
            case 3276:
                if (!strQ0.equals("fr")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(5);
                }
                break;
            case 3371:
                if (!strQ0.equals("it")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(20);
                }
                break;
            case 3398:
                if (!strQ0.equals("jp")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(1);
                }
                break;
            case 3431:
                if (!strQ0.equals("kr")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(2);
                }
                break;
            case 3588:
                if (!strQ0.equals("pt")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(8);
                }
                break;
            case 3651:
                if (!strQ0.equals("ru")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(10);
                }
                break;
            case 3774:
                if (!strQ0.equals("vt")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(7);
                }
                break;
            case 3886:
                if (!strQ0.equals("zh")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(9);
                }
                break;
            case 96848:
                if (!strQ0.equals("ara")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(51);
                }
                break;
            case 102624:
                if (!strQ0.equals("grk")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(65);
                }
                break;
            case 104115:
                if (!strQ0.equals("idn")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(18);
                }
                break;
            case 107864:
                if (!strQ0.equals(obj)) {
                    obj = obj;
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(69);
                    obj = obj;
                }
                break;
            case 111181:
                if (!strQ0.equals(obj2)) {
                    obj2 = obj2;
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(19);
                    obj2 = obj2;
                }
                break;
            case 114649:
                if (!strQ0.equals("tch")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(9);
                }
                break;
            case 115217:
                if (!strQ0.equals(obj3)) {
                    obj3 = obj3;
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(21);
                    obj3 = obj3;
                }
                break;
            case 115868:
                if (!strQ0.equals(obj4)) {
                    obj4 = obj4;
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(63);
                    obj4 = obj4;
                }
                break;
            case 3058758:
                if (!strQ0.equals(obj5)) {
                    obj5 = obj5;
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(11);
                    obj5 = obj5;
                }
                break;
            case 3079701:
                if (!strQ0.equals("deoc")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(6);
                }
                break;
            case 3079900:
                if (!strQ0.equals("deup")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(16);
                }
                break;
            case 3117847:
                if (!strQ0.equals("enes")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(49);
                }
                break;
            case 3122946:
                if (!strQ0.equals("esoc")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(4);
                }
                break;
            case 3123145:
                if (!strQ0.equals("esup")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(14);
                }
                break;
            case 3123148:
                if (!strQ0.equals("esus")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(47);
                }
                break;
            case 3151776:
                if (!strQ0.equals("froc")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(5);
                }
                break;
            case 3151975:
                if (!strQ0.equals("frup")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(15);
                }
                break;
            case 3151978:
                if (!strQ0.equals("frus")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(53);
                }
                break;
            case 3243071:
                if (!strQ0.equals("itoc")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(20);
                }
                break;
            case 3269217:
                if (!strQ0.equals("jpup")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(12);
                }
                break;
            case 3300930:
                if (!strQ0.equals("krup")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(13);
                }
                break;
            case 3451608:
                if (!strQ0.equals("ptoc")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(8);
                }
                break;
            case 3451807:
                if (!strQ0.equals("ptup")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(17);
                }
                break;
            case 3512151:
                if (!strQ0.equals("ruoc")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(10);
                }
                break;
            case 3512350:
                if (!strQ0.equals("ruup")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(22);
                }
                break;
            case 3558812:
                if (!strQ0.equals("thai")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(57);
                }
                break;
            case 93074667:
                if (!strQ0.equals("araup")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(55);
                }
                break;
            case 99283154:
                if (!strQ0.equals("hindi")) {
                    languageItem.setKeyLanguage(0);
                } else {
                    languageItem.setKeyLanguage(61);
                }
                break;
            default:
                languageItem.setKeyLanguage(0);
                break;
        }
        String strQ1 = oz.x.q0(str3, "oc", BuildConfig.VERSION_NAME);
        switch (strQ1.hashCode()) {
            case -1298712590:
                if (!strQ1.equals("enesup")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(50);
                }
                break;
            case -1293618329:
                if (!strQ1.equals("esusup")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(48);
                }
                break;
            case -1265912699:
                if (!strQ1.equals("frusup")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(54);
                }
                break;
            case 3179:
                if (!strQ1.equals("cn")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(0);
                }
                break;
            case 3201:
                if (!strQ1.equals("de")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(6);
                }
                break;
            case 3241:
                if (!strQ1.equals("en")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(3);
                }
                break;
            case 3246:
                if (!strQ1.equals("es")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(4);
                }
                break;
            case 3276:
                if (!strQ1.equals("fr")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(5);
                }
                break;
            case 3371:
                if (!strQ1.equals("it")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(20);
                }
                break;
            case 3398:
                if (!strQ1.equals("jp")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(1);
                }
                break;
            case 3431:
                if (!strQ1.equals("kr")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(2);
                }
                break;
            case 3588:
                if (!strQ1.equals("pt")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(8);
                }
                break;
            case 3651:
                if (!strQ1.equals("ru")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(10);
                }
                break;
            case 3774:
                if (!strQ1.equals("vt")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(7);
                }
                break;
            case 3886:
                if (!strQ1.equals("zh")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(9);
                }
                break;
            case 96848:
                if (!strQ1.equals("ara")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(51);
                }
                break;
            case 102624:
                if (!strQ1.equals("grk")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(65);
                }
                break;
            case 104115:
                if (!strQ1.equals("idn")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(18);
                }
                break;
            case 107864:
                if (!strQ1.equals(obj)) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(69);
                }
                break;
            case 111181:
                if (!strQ1.equals(obj2)) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(19);
                }
                break;
            case 114649:
                if (!strQ1.equals("tch")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(9);
                }
                break;
            case 115217:
                if (!strQ1.equals(obj3)) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(21);
                }
                break;
            case 115868:
                if (!strQ1.equals(obj4)) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(63);
                }
                break;
            case 3058758:
                if (!strQ1.equals(obj5)) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(11);
                }
                break;
            case 3079900:
                if (!strQ1.equals("deup")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(16);
                }
                break;
            case 3117847:
                if (!strQ1.equals("enes")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(49);
                }
                break;
            case 3123145:
                if (!strQ1.equals("esup")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(14);
                }
                break;
            case 3123148:
                if (!strQ1.equals("esus")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(47);
                }
                break;
            case 3151975:
                if (!strQ1.equals("frup")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(15);
                }
                break;
            case 3151978:
                if (!strQ1.equals("frus")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(53);
                }
                break;
            case 3269217:
                if (!strQ1.equals("jpup")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(12);
                }
                break;
            case 3300930:
                if (!strQ1.equals("krup")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(13);
                }
                break;
            case 3451807:
                if (!strQ1.equals("ptup")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(17);
                }
                break;
            case 3512350:
                if (!strQ1.equals("ruup")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(22);
                }
                break;
            case 3558812:
                if (!strQ1.equals("thai")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(57);
                }
                break;
            case 93074667:
                if (!strQ1.equals("araup")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(55);
                }
                break;
            case 99283154:
                if (!strQ1.equals("hindi")) {
                    languageItem.setLocate(3);
                } else {
                    languageItem.setLocate(61);
                }
                break;
            default:
                languageItem.setLocate(3);
                break;
        }
        languageItem.setId(languageItem.getKeyLanguage() + str4 + languageItem.getLocate());
        languageItem.setName(s(context, languageItem.getKeyLanguage()));
        return languageItem;
    }

    public static Resources w(Context context, String locateLanguage) {
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(locateLanguage, "locateLanguage");
        Locale TRADITIONAL_CHINESE = new Locale(locateLanguage);
        if (oz.x.s0(locateLanguage, "zh", false)) {
            TRADITIONAL_CHINESE = Locale.TRADITIONAL_CHINESE;
            kotlin.jvm.internal.m.e(TRADITIONAL_CHINESE, "TRADITIONAL_CHINESE");
        }
        Configuration configuration = context.getResources().getConfiguration();
        kotlin.jvm.internal.m.e(configuration, "getConfiguration(...)");
        Configuration configuration2 = new Configuration(configuration);
        configuration2.setLocale(TRADITIONAL_CHINESE);
        Resources resources = context.createConfigurationContext(configuration2).getResources();
        kotlin.jvm.internal.m.e(resources, "getResources(...)");
        return resources;
    }

    public static String x(int i11) {
        if (i11 == 51) {
            return "ar";
        }
        if (i11 == 57) {
            return "th";
        }
        if (i11 == 61) {
            return "hi";
        }
        if (i11 == 69) {
            return "mal";
        }
        switch (i11) {
            case 1:
                return "ja";
            case 2:
                return "ko";
            case 3:
                return "en";
            case 4:
                return "es";
            case 5:
                return "fr";
            case 6:
                return "de";
            case 7:
                return "vi";
            case 8:
                return "pt";
            case 9:
                return "zh";
            case 10:
                return "ru";
            default:
                switch (i11) {
                    case 18:
                        return "in";
                    case 19:
                        return "pl";
                    case 20:
                        return "it";
                    case 21:
                        return "tr";
                    default:
                        return "en";
                }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String y(Resources resources, String locateLanguage) {
        kotlin.jvm.internal.m.f(resources, "resources");
        kotlin.jvm.internal.m.f(locateLanguage, "locateLanguage");
        switch (locateLanguage.hashCode()) {
            case 3121:
                if (locateLanguage.equals("ar")) {
                    String string = resources.getString(R.string.locate_arabic);
                    kotlin.jvm.internal.m.e(string, "getString(...)");
                    return string;
                }
                break;
            case 3201:
                if (locateLanguage.equals("de")) {
                    String string2 = resources.getString(R.string.locate_german);
                    kotlin.jvm.internal.m.e(string2, "getString(...)");
                    return string2;
                }
                break;
            case 3241:
                if (locateLanguage.equals("en")) {
                    String string3 = resources.getString(R.string.locate_english);
                    kotlin.jvm.internal.m.e(string3, "getString(...)");
                    return string3;
                }
                break;
            case 3246:
                if (locateLanguage.equals("es")) {
                    String string4 = resources.getString(R.string.locate_spanish);
                    kotlin.jvm.internal.m.e(string4, "getString(...)");
                    return string4;
                }
                break;
            case 3276:
                if (locateLanguage.equals("fr")) {
                    String string5 = resources.getString(R.string.locate_french);
                    kotlin.jvm.internal.m.e(string5, "getString(...)");
                    return string5;
                }
                break;
            case 3365:
                if (locateLanguage.equals("in")) {
                    String string6 = resources.getString(R.string.locate_indonesia);
                    kotlin.jvm.internal.m.e(string6, "getString(...)");
                    return string6;
                }
                break;
            case 3371:
                if (locateLanguage.equals("it")) {
                    String string7 = resources.getString(R.string.locate_italy);
                    kotlin.jvm.internal.m.e(string7, "getString(...)");
                    return string7;
                }
                break;
            case 3383:
                if (locateLanguage.equals("ja")) {
                    String string8 = resources.getString(R.string.locate_japanese);
                    kotlin.jvm.internal.m.e(string8, "getString(...)");
                    return string8;
                }
                break;
            case 3428:
                if (locateLanguage.equals("ko")) {
                    String string9 = resources.getString(R.string.locate_korean);
                    kotlin.jvm.internal.m.e(string9, "getString(...)");
                    return string9;
                }
                break;
            case 3580:
                if (locateLanguage.equals("pl")) {
                    String string10 = resources.getString(R.string.locate_polish);
                    kotlin.jvm.internal.m.e(string10, "getString(...)");
                    return string10;
                }
                break;
            case 3588:
                if (locateLanguage.equals("pt")) {
                    String string11 = resources.getString(R.string.locate_portuguese);
                    kotlin.jvm.internal.m.e(string11, "getString(...)");
                    return string11;
                }
                break;
            case 3651:
                if (locateLanguage.equals("ru")) {
                    String string12 = resources.getString(R.string.locate_russian);
                    kotlin.jvm.internal.m.e(string12, "getString(...)");
                    return string12;
                }
                break;
            case 3700:
                if (locateLanguage.equals("th")) {
                    String string13 = resources.getString(R.string.locate_thai);
                    kotlin.jvm.internal.m.e(string13, "getString(...)");
                    return string13;
                }
                break;
            case 3710:
                if (locateLanguage.equals("tr")) {
                    String string14 = resources.getString(R.string.locate_turkish);
                    kotlin.jvm.internal.m.e(string14, "getString(...)");
                    return string14;
                }
                break;
            case 3763:
                if (locateLanguage.equals("vi")) {
                    String string15 = resources.getString(R.string.locate_vietnamese);
                    kotlin.jvm.internal.m.e(string15, "getString(...)");
                    return string15;
                }
                break;
            case 3886:
                if (locateLanguage.equals("zh")) {
                    String string16 = resources.getString(R.string.locate_traditional_chinese);
                    kotlin.jvm.internal.m.e(string16, "getString(...)");
                    return string16;
                }
                break;
        }
        String string17 = resources.getString(R.string.locate_english);
        kotlin.jvm.internal.m.e(string17, "getString(...)");
        return string17;
    }

    public static String z(Context context) {
        kotlin.jvm.internal.m.f(context, "context");
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == Process.myPid()) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    @Override // tx.c
    public void accept(Object obj) {
        Throwable throwable = (Throwable) obj;
        kotlin.jvm.internal.m.f(throwable, "throwable");
        throwable.getMessage();
    }

    public static String j(int i11) {
        if (i11 == 40) {
            return "itocup";
        }
        if (i11 == 57) {
            return "thai";
        }
        if (i11 == 61) {
            return "hindi";
        }
        if (i11 == 63) {
            return "ukr";
        }
        if (i11 == 65) {
            return "grk";
        }
        if (i11 == 69) {
            return "mal";
        }
        switch (i11) {
            case 0:
                return "cn";
            case 1:
                return "jp";
            case 2:
                return "kr";
            case 3:
                return "en";
            case 4:
                return "esoc";
            case 5:
                return "froc";
            case 6:
                return "deoc";
            case 7:
                return "vt";
            case 8:
                return "pt";
            case 9:
                return "tch";
            case 10:
                return "ruoc";
            case 11:
                return "cnup";
            case 12:
                return "jpup";
            case 13:
                return "krup";
            case 14:
                return "esocup";
            case 15:
                return "frocup";
            case 16:
                return "deocup";
            case 17:
                return aYZzTH.FOUy;
            case 18:
                return "idn";
            case 19:
                return "pol";
            case 20:
                return "itoc";
            case 21:
                return "tur";
            case 22:
                return "ruocup";
            default:
                switch (i11) {
                    case 47:
                        return "esus";
                    case 48:
                        return "esusup";
                    case 49:
                        return "enes";
                    case 50:
                        return "enesup";
                    case 51:
                        return "ara";
                    default:
                        switch (i11) {
                            case 53:
                                return "frus";
                            case 54:
                                return "frusup";
                            case 55:
                                return "araup";
                            default:
                                return BuildConfig.VERSION_NAME;
                        }
                }
        }
    }

    public static String r(int i11) {
        if (i11 == 40) {
            return "itup";
        }
        if (i11 == 57) {
            return "thai";
        }
        if (i11 == 61) {
            return "hindi";
        }
        if (i11 == 63) {
            return "ukr";
        }
        if (i11 == 65) {
            return bjXGJ.zQMFtVCWvbSBw;
        }
        if (i11 == 69) {
            return "mal";
        }
        switch (i11) {
            case 0:
                return "cn";
            case 1:
                return "jp";
            case 2:
                return "kr";
            case 3:
                return "en";
            case 4:
                return "es";
            case 5:
                return "fr";
            case 6:
                return "de";
            case 7:
                return "vt";
            case 8:
                return "pt";
            case 9:
                return "tch";
            case 10:
                return "ru";
            case 11:
                return "cnup";
            case 12:
                return "jpup";
            case 13:
                return "krup";
            case 14:
                return "esup";
            case 15:
                return "frup";
            case 16:
                return "deup";
            case 17:
                return "ptup";
            case 18:
                return ualZoVVCQs.gNJRvhZjcsLANs;
            case 19:
                return "pol";
            case 20:
                return "it";
            case 21:
                return "tur";
            case 22:
                return "ruup";
            default:
                switch (i11) {
                    case 47:
                        return "esus";
                    case 48:
                        return "esusup";
                    case 49:
                        return "enes";
                    case 50:
                        return "enesup";
                    case 51:
                        return "ara";
                    default:
                        switch (i11) {
                            case 53:
                                return "frus";
                            case 54:
                                return "frusup";
                            case 55:
                                return "araup";
                            default:
                                return BuildConfig.VERSION_NAME;
                        }
                }
        }
    }

    public static String t(int i11) {
        if (i11 == 0) {
            return "cn";
        }
        if (i11 == 40) {
            return "it";
        }
        if (i11 == 57) {
            return "thai";
        }
        if (i11 == 61) {
            return "hindi";
        }
        if (i11 == 63) {
            return "ukr";
        }
        if (i11 == 65) {
            return "grk";
        }
        if (i11 == 69) {
            return "mal";
        }
        switch (i11) {
            case 2:
                return "kr";
            case 3:
                return "en";
            case 4:
                return "es";
            case 5:
                return "fr";
            case 6:
                return "de";
            case 7:
                return "vt";
            case 8:
                return "pt";
            case 9:
                return "tch";
            case 10:
                return "ru";
            case 11:
                return "cn";
            default:
                switch (i11) {
                    case 13:
                        return "kr";
                    case 14:
                        return "es";
                    case 15:
                        return "fr";
                    case 16:
                        return "de";
                    case 17:
                        return "pt";
                    case 18:
                        return "idn";
                    case 19:
                        return "pol";
                    case 20:
                        return "it";
                    case 21:
                        return "tur";
                    case 22:
                        return "ru";
                    default:
                        switch (i11) {
                            case 47:
                            case 48:
                                return "esus";
                            case 49:
                            case 50:
                                return "en";
                            case 51:
                                break;
                            default:
                                switch (i11) {
                                    case 53:
                                    case 54:
                                        return "fr";
                                    case 55:
                                        break;
                                    default:
                                        return "jp";
                                }
                                break;
                        }
                        return xTCJ.XRRXdohOHcEeX;
                }
        }
    }
}
