package ks;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.tbruyelle.rxpermissions3.BuildConfig;
import iv.h0;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.m;
import ns.o;
import oz.q;
import oz.x;
import qy.b0;
import qy.l;
import ry.n;
import rz.e0;
import rz.o0;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f38636a = {"cn_skill_v2.zip", "cn_hand_write.zip", "cn_sc.zip", MzwEyWCkjXL.kQxgjqP, "cn_tone.zip", "jp_skill.zip", "jp_hand_write.zip", "jp_char_stroke_debug_v3.zip", "jp_sc.zip", "ru_sc.zip", "de_sc.zip", "en_sc.zip", "it_sc.zip", "pt_sc.zip", "ar_sc.zip", "vt_sc.zip", "thai_sc.zip", "tur_sc.zip", "hi_sc.zip", "ukr_sc.zip", "grk_sc.zip", "pol_sc.zip", "idn_sc.zip", "mal_sc.zip", "kr_skill.zip", "kr_sc.zip", "en_skill.zip", "vt_skill.zip", "pt_skill.zip", "es_skill.zip", "es_sc.zip", "fr_skill.zip", "fr_sc.zip", "de_skill.zip", "krup_skill.zip", "jpup_skill.zip", "cnup_skill_v2.zip", "ru_skill.zip", "it_skill.zip", "enes_skill.zip", "esus_skill.zip", "frus_skill.zip", "ar_skill.zip", "ar_hand_write.zip", "thai_skill.zip", "tur_skill.zip", "hindi_skill.zip", "ukr_skill.zip", "grk_skill.zip", "idn_skill.zip", "pol_skill.zip", "mal_skill.zip"};

    public static l a(File file) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                String name = nextEntry.getName();
                m.e(name, "getName(...)");
                if (!k(name)) {
                    String name2 = nextEntry.getName();
                    m.e(name2, "getName(...)");
                    List listX0 = q.X0(name2, new char[]{'/', '\\'}, 6);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listX0) {
                        if (((String) obj).length() > 0) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        linkedHashSet.add(arrayList.get(0));
                    }
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    o.m(zipInputStream, th2);
                    throw th3;
                }
            }
        }
        zipInputStream.close();
        String str = null;
        if (linkedHashSet.size() == 1) {
            String str2 = (String) ry.m.p0(linkedHashSet);
            ZipInputStream zipInputStream2 = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
            while (true) {
                try {
                    ZipEntry nextEntry2 = zipInputStream2.getNextEntry();
                    if (nextEntry2 == null) {
                        zipInputStream2.close();
                        break;
                    }
                    String name3 = nextEntry2.getName();
                    m.e(name3, "getName(...)");
                    if (!k(name3)) {
                        String name4 = nextEntry2.getName();
                        m.e(name4, "getName(...)");
                        String strP0 = x.p0(name4, '\\', '/');
                        if (x.s0(strP0, str2 + "/", false)) {
                            if (!strP0.equals(str2 + "/")) {
                                zipInputStream2.close();
                                str = str2;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        o.m(zipInputStream2, th4);
                        throw th5;
                    }
                }
            }
        }
        return new l(linkedHashSet, str);
    }

    public static String b(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        String strP0 = x.p0(str, '\\', '/');
        if (!x.s0(strP0, str2.concat("/"), false)) {
            return strP0.equals(str2) ? BuildConfig.VERSION_NAME : str;
        }
        String strSubstring = strP0.substring(str2.length() + 1);
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String c(Context context) {
        m.f(context, "<this>");
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? BuildConfig.VERSION_NAME : str;
        } catch (Exception e8) {
            e8.printStackTrace();
            return BuildConfig.VERSION_NAME;
        }
    }

    public static final InputStream d(Context context, String str) {
        m.f(context, "context");
        InputStream inputStreamOpen = context.getAssets().open(str);
        m.e(inputStreamOpen, "open(...)");
        return inputStreamOpen;
    }

    public static boolean e(String word) {
        m.f(word, "word");
        String[] strArr = {".", "!", "?", "!!!", "...", ";"};
        for (int i11 = 0; i11 < 6; i11++) {
            String str = strArr[i11];
            int length = str.length() - 1;
            int i12 = 0;
            boolean z11 = false;
            while (i12 <= length) {
                boolean z12 = m.h(str.charAt(!z11 ? i12 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    }
                    length--;
                } else if (z12) {
                    i12++;
                } else {
                    z11 = true;
                }
            }
            String strG = w4.c.g(str, length, 1, i12);
            int length2 = word.length() - 1;
            int i13 = 0;
            boolean z13 = false;
            while (i13 <= length2) {
                boolean z14 = m.h(word.charAt(!z13 ? i13 : length2), 32) <= 0;
                if (z13) {
                    if (!z14) {
                        break;
                    }
                    length2--;
                } else if (z14) {
                    i13++;
                } else {
                    z13 = true;
                }
            }
            if (m.a(strG, word.subSequence(i13, length2 + 1).toString())) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(File file, File file2) {
        try {
            String canonicalPath = file2.getCanonicalPath();
            String canonicalPath2 = file.getCanonicalPath();
            m.c(canonicalPath2);
            String str = File.separator;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(canonicalPath);
            sb2.append(str);
            return x.s0(canonicalPath2, sb2.toString(), false) || canonicalPath2.equals(canonicalPath);
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(Context context, Bitmap bitmap, xy.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i11 = aVar.f38635b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f38635b = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(cVar);
            }
        } else {
            aVar = new a(cVar);
        }
        Object objM = aVar.f38634a;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = aVar.f38635b;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objM);
            yz.f fVar = o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            h0 h0Var = new h0(15, context, bitmap, null);
            aVar.f38635b = 1;
            objM = e0.M(eVar, h0Var, aVar);
            if (objM == aVar2) {
                return aVar2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objM);
        }
        m.e(objM, "withContext(...)");
        return objM;
    }

    public static final Object h(Context context, Bitmap bitmap, String str, i iVar) {
        yz.f fVar = o0.f50940a;
        Object objM = e0.M(yz.e.f58387a, new ad.x(context, str, bitmap, null, 16), iVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : b0.f48488a;
    }

    public static final void i(Context context, Uri uri, String packageName, String title) {
        m.f(context, "<this>");
        m.f(uri, "uri");
        m.f(packageName, "packageName");
        m.f(title, "title");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.putExtra("android.intent.extra.TITLE", title);
        intent.setType("image/png");
        intent.setPackage(packageName);
        intent.setClipData(ClipData.newUri(context.getContentResolver(), title, uri));
        intent.addFlags(1);
        Intent intentCreateChooser = Intent.createChooser(intent, title);
        intentCreateChooser.addFlags(1);
        context.startActivity(intentCreateChooser);
    }

    public static final void j(Context context, Uri uri) {
        m.f(context, "<this>");
        m.f(uri, "uri");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.putExtra("android.intent.extra.TITLE", "LingoDeer");
        intent.setType("image/png");
        intent.setClipData(ClipData.newUri(context.getContentResolver(), "LingoDeer", uri));
        intent.addFlags(1);
        Intent intentCreateChooser = Intent.createChooser(intent, "Share LingoDeer");
        intentCreateChooser.addFlags(1);
        context.startActivity(intentCreateChooser);
    }

    public static boolean k(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        m.e(lowerCase, "toLowerCase(...)");
        return x.s0(lowerCase, "__macosx/", false) || x.s0(lowerCase, "__macosx\\", false) || q.v0(lowerCase, "/.ds_store", false) || q.v0(lowerCase, "\\.ds_store", false) || x.k0(lowerCase, ".ds_store", false) || q.v0(lowerCase, "/.", false) || q.v0(lowerCase, "thumbs.db", false);
    }

    public static final HashMap l(String str) {
        m.f(str, "<this>");
        List listW0 = q.W0(str, new String[]{";"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listW0) {
            if (q.i1((String) obj).toString().length() > 0) {
                arrayList.add(obj);
            }
        }
        HashMap map = new HashMap();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            List listW1 = q.W0((String) obj2, new String[]{":"}, 0, 6);
            map.put(Long.valueOf(Long.parseLong((String) listW1.get(0))), Integer.valueOf(Integer.parseInt((String) listW1.get(1))));
        }
        return map;
    }

    public static final ArrayList m(String str) {
        m.f(str, "<this>");
        int i11 = 0;
        List listW0 = q.W0(str, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listW0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(n.W(arrayList, 10));
        int size = arrayList.size();
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            arrayList2.add(Integer.valueOf(Integer.parseInt((String) obj2)));
        }
        return arrayList2;
    }

    public static final ArrayList n(String str) {
        m.f(str, "<this>");
        int i11 = 0;
        List listW0 = q.W0(str, new String[]{";"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listW0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(n.W(arrayList, 10));
        int size = arrayList.size();
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            arrayList2.add(Long.valueOf(Long.parseLong((String) obj2)));
        }
        return arrayList2;
    }

    public static boolean o(String str, String zipName) {
        m.f(zipName, "zipName");
        File file = new File(str, zipName);
        if (!file.exists()) {
            return false;
        }
        File file2 = new File(str);
        try {
            l lVarA = a(file);
            String str2 = (String) lVarA.f48496b;
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        zipInputStream.close();
                        file.delete();
                        file.createNewFile();
                        return true;
                    }
                    String name = nextEntry.getName();
                    m.e(name, "getName(...)");
                    if (!k(name)) {
                        String name2 = nextEntry.getName();
                        m.e(name2, "getName(...)");
                        String strB = b(name2, str2);
                        File file3 = new File(file2, strB);
                        if (!f(file3, file2)) {
                            throw new SecurityException("检测到不安全的解压路径: " + strB);
                        }
                        if (!nextEntry.isDirectory()) {
                            File parentFile = file3.getParentFile();
                            if (parentFile != null && !parentFile.exists()) {
                                parentFile.mkdirs();
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream(file3);
                            while (true) {
                                try {
                                    int i11 = zipInputStream.read(bArr);
                                    if (i11 == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i11);
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        o.m(fileOutputStream, th2);
                                        throw th3;
                                    }
                                }
                                try {
                                    throw th;
                                } catch (Throwable th4) {
                                    o.m(zipInputStream, th);
                                    throw th4;
                                }
                            }
                            fileOutputStream.close();
                        } else if (strB.length() > 0 && !file3.exists()) {
                            file3.mkdirs();
                        }
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        } catch (IOException e8) {
            e8.printStackTrace();
            file.delete();
            return false;
        } catch (SecurityException e10) {
            e10.printStackTrace();
            file.delete();
            return false;
        }
    }
}
