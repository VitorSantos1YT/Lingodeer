package com.lingodeer.data.env;

import android.content.Context;
import android.content.res.AssetManager;
import ep.a;
import fa.EQx.nuRcCS;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.m;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class StartupUtil {
    public static final StartupUtil INSTANCE = new StartupUtil();

    private StartupUtil() {
    }

    public static final void handleException(Throwable t6) {
        m.f(t6, "t");
        t6.printStackTrace();
    }

    public static final boolean initAppDataDirectory(Context context, Env env) throws Exception {
        char c11;
        m.f(context, "context");
        m.f(env, "env");
        StorageLocationMgr storageLocationMgr = new StorageLocationMgr(context);
        String str = env.storageLoc;
        if (str == null) {
            env.storageLoc = "phone";
            env.updateEntry("storageLoc");
            File filesDir = context.getFilesDir();
            StartupUtil startupUtil = INSTANCE;
            m.c(filesDir);
            return startupUtil.initAppDirectory(filesDir, env);
        }
        File fileCheckAvailable = null;
        if (!str.equals("sdcard") && !str.equals("phone")) {
            env.storageLoc = null;
        }
        String storageLoc = env.storageLoc;
        if (storageLoc == null) {
            m.e(storageLoc, "storageLoc");
            fileCheckAvailable = storageLocationMgr.checkAvailable(storageLoc);
            c11 = fileCheckAvailable == null ? (char) 2 : (char) 1;
        } else {
            c11 = 0;
        }
        if (c11 != 1) {
            env.storageLoc = "phone";
            env.updateEntry("storageLoc");
            File filesDir2 = context.getFilesDir();
            StartupUtil startupUtil2 = INSTANCE;
            m.c(filesDir2);
            return startupUtil2.initAppDirectory(filesDir2, env);
        }
        if (fileCheckAvailable == null) {
            return false;
        }
        try {
            return INSTANCE.initAppDirectory(fileCheckAvailable, env);
        } catch (Exception e8) {
            String message = e8.getMessage();
            m.c(message);
            if (!x.s0(message, "Can't create folder ", false)) {
                throw e8;
            }
            env.storageLoc = "phone";
            env.updateEntry("storageLoc");
            File filesDir3 = context.getFilesDir();
            StartupUtil startupUtil3 = INSTANCE;
            m.c(filesDir3);
            return startupUtil3.initAppDirectory(filesDir3, env);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    public final void cpAssetFile(Context context, String str, File dstFile) throws Throwable {
        m.f(context, "context");
        m.f(dstFile, "dstFile");
        byte[] bArr = new byte[512];
        AssetManager assets = context.getAssets();
        m.c(str);
        InputStream inputStreamOpen = assets.open(str);
        m.e(inputStreamOpen, "open(...)");
        FileOutputStream fileOutputStream = new FileOutputStream(dstFile);
        while (true) {
            boolean z11 = false;
            try {
                int i11 = inputStreamOpen.read(bArr);
                if (i11 != -1) {
                    dstFile.getPath();
                    inputStreamOpen.close();
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, i11);
            } catch (IOException e8) {
                try {
                    throw e8;
                } catch (Throwable th2) {
                    th = th2;
                    z11 = true;
                    inputStreamOpen.close();
                    fileOutputStream.close();
                    if (z11) {
                        dstFile.delete();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamOpen.close();
                fileOutputStream.close();
                if (z11) {
                    dstFile.delete();
                }
                throw th;
            }
        }
    }

    public final boolean initAppDirectory(File rootFile, Env env) throws IOException {
        m.f(rootFile, "rootFile");
        m.f(env, "env");
        env.rootDir = rootFile.getPath();
        File file = new File(rootFile, "im");
        File file2 = new File(rootFile, "data");
        File file3 = new File(file2, "cs");
        File file4 = new File(file3, "main");
        new File(file3, "sc");
        File file5 = new File(file2, "js");
        File file6 = new File(file5, "main");
        File file7 = new File(file2, "kr");
        File file8 = new File(file7, "main");
        File file9 = new File(file2, "en");
        File file10 = new File(file9, "main");
        File file11 = new File(file2, "es");
        File file12 = new File(file11, "main");
        File file13 = new File(file2, "fr");
        File file14 = new File(file13, "main");
        File file15 = new File(file2, "vt");
        File file16 = new File(file15, "main");
        File file17 = new File(file2, "krup");
        File file18 = new File(file17, "main");
        File file19 = new File(file2, "jpup");
        File file20 = new File(file19, "main");
        File file21 = new File(file2, "cnup");
        File file22 = new File(file21, "main");
        File file23 = new File(file2, "pt");
        File file24 = new File(file23, "main");
        File file25 = new File(file2, "de");
        File file26 = new File(file25, "main");
        File file27 = new File(file2, "ru");
        File file28 = new File(file27, "main");
        File file29 = new File(file2, "it");
        new File(file29, "main");
        File file30 = new File(rootFile, "file_temp");
        File file31 = new File(rootFile, "ASR-Env");
        File file32 = new File(rootFile, "feedback_temp");
        File file33 = new File(file3, "story");
        File file34 = new File(file3, "story_leadboard");
        File file35 = new File(file21, "story");
        File file36 = new File(file21, "story_leadboard");
        File file37 = new File(file5, "story");
        File file38 = new File(file5, "story_leadboard");
        File file39 = new File(file19, "story");
        File file40 = new File(file19, "story_leadboard");
        File file41 = new File(file7, "story");
        File file42 = new File(file7, "story_leadboard");
        File file43 = new File(file17, "story");
        File file44 = new File(file17, "story_leadboard");
        File file45 = new File(file11, "story");
        File file46 = new File(file11, "story_leadboard");
        File file47 = new File(file13, "story");
        File file48 = new File(file13, "story_leadboard");
        File file49 = new File(file25, "story");
        File file50 = new File(file25, "story_leadboard");
        File file51 = new File(file23, "story");
        File file52 = new File(file23, "story_leadboard");
        File file53 = new File(file29, "story");
        File file54 = new File(file29, "story_leadboard");
        String imDir = file.getCanonicalPath();
        env.imDir = imDir;
        m.e(imDir, "imDir");
        x.k0(imDir, "/", false);
        if (!file.exists() && !file.mkdirs()) {
            throw new IOException(a.e("Can't create folder ", env.imDir));
        }
        String canonicalPath = file2.getCanonicalPath();
        env.dataDir = canonicalPath;
        m.e(canonicalPath, nuRcCS.WaXBaBqUg);
        x.k0(canonicalPath, "/", false);
        String csDataDir = file3.getCanonicalPath();
        env.csDataDir = csDataDir;
        m.e(csDataDir, "csDataDir");
        x.k0(csDataDir, "/", false);
        String csMainDir = file4.getCanonicalPath();
        env.csMainDir = csMainDir;
        m.e(csMainDir, "csMainDir");
        x.k0(csMainDir, "/", false);
        String jsDataDir = file5.getCanonicalPath();
        env.jsDataDir = jsDataDir;
        m.e(jsDataDir, "jsDataDir");
        x.k0(jsDataDir, "/", false);
        String jsMainDir = file6.getCanonicalPath();
        env.jsMainDir = jsMainDir;
        m.e(jsMainDir, "jsMainDir");
        x.k0(jsMainDir, "/", false);
        String koDataDir = file7.getCanonicalPath();
        env.koDataDir = koDataDir;
        m.e(koDataDir, "koDataDir");
        x.k0(koDataDir, "/", false);
        String koMainDir = file8.getCanonicalPath();
        env.koMainDir = koMainDir;
        m.e(koMainDir, "koMainDir");
        x.k0(koMainDir, "/", false);
        String enDataDir = file9.getCanonicalPath();
        env.enDataDir = enDataDir;
        m.e(enDataDir, "enDataDir");
        x.k0(enDataDir, "/", false);
        String enMainDir = file10.getCanonicalPath();
        env.enMainDir = enMainDir;
        m.e(enMainDir, "enMainDir");
        x.k0(enMainDir, "/", false);
        String esDataDir = file11.getCanonicalPath();
        env.esDataDir = esDataDir;
        m.e(esDataDir, "esDataDir");
        x.k0(esDataDir, "/", false);
        String esMainDir = file12.getCanonicalPath();
        env.esMainDir = esMainDir;
        m.e(esMainDir, "esMainDir");
        x.k0(esMainDir, "/", false);
        String frDataDir = file13.getCanonicalPath();
        env.frDataDir = frDataDir;
        m.e(frDataDir, "frDataDir");
        x.k0(frDataDir, "/", false);
        String frMainDir = file14.getCanonicalPath();
        env.frMainDir = frMainDir;
        m.e(frMainDir, "frMainDir");
        x.k0(frMainDir, "/", false);
        String vtDataDir = file15.getCanonicalPath();
        env.vtDataDir = vtDataDir;
        m.e(vtDataDir, "vtDataDir");
        x.k0(vtDataDir, "/", false);
        String vtMainDir = file16.getCanonicalPath();
        env.vtMainDir = vtMainDir;
        m.e(vtMainDir, "vtMainDir");
        x.k0(vtMainDir, "/", false);
        String ptDataDir = file23.getCanonicalPath();
        env.ptDataDir = ptDataDir;
        m.e(ptDataDir, "ptDataDir");
        x.k0(ptDataDir, "/", false);
        String ptMainDir = file24.getCanonicalPath();
        env.ptMainDir = ptMainDir;
        m.e(ptMainDir, "ptMainDir");
        x.k0(ptMainDir, "/", false);
        String deDataDir = file25.getCanonicalPath();
        env.deDataDir = deDataDir;
        m.e(deDataDir, "deDataDir");
        x.k0(deDataDir, "/", false);
        String deMainDir = file26.getCanonicalPath();
        env.deMainDir = deMainDir;
        m.e(deMainDir, "deMainDir");
        x.k0(deMainDir, "/", false);
        String ruDataDir = file27.getCanonicalPath();
        env.ruDataDir = ruDataDir;
        m.e(ruDataDir, "ruDataDir");
        x.k0(ruDataDir, "/", false);
        String ruMainDir = file28.getCanonicalPath();
        env.ruMainDir = ruMainDir;
        m.e(ruMainDir, "ruMainDir");
        x.k0(ruMainDir, "/", false);
        String krupDataDir = file17.getCanonicalPath();
        env.krupDataDir = krupDataDir;
        m.e(krupDataDir, "krupDataDir");
        x.k0(krupDataDir, "/", false);
        String krupMainDir = file18.getCanonicalPath();
        env.krupMainDir = krupMainDir;
        m.e(krupMainDir, "krupMainDir");
        x.k0(krupMainDir, "/", false);
        String jpupDataDir = file19.getCanonicalPath();
        env.jpupDataDir = jpupDataDir;
        m.e(jpupDataDir, "jpupDataDir");
        x.k0(jpupDataDir, "/", false);
        String jpupMainDir = file20.getCanonicalPath();
        env.jpupMainDir = jpupMainDir;
        m.e(jpupMainDir, "jpupMainDir");
        x.k0(jpupMainDir, "/", false);
        String cnupDataDir = file21.getCanonicalPath();
        env.cnupDataDir = cnupDataDir;
        m.e(cnupDataDir, "cnupDataDir");
        x.k0(cnupDataDir, "/", false);
        String cnupMainDir = file22.getCanonicalPath();
        env.cnupMainDir = cnupMainDir;
        m.e(cnupMainDir, "cnupMainDir");
        x.k0(cnupMainDir, "/", false);
        String csStoryMainDir = file33.getCanonicalPath();
        env.csStoryMainDir = csStoryMainDir;
        m.e(csStoryMainDir, "csStoryMainDir");
        x.k0(csStoryMainDir, "/", false);
        String csStoryLeadBoardDir = file34.getCanonicalPath();
        env.csStoryLeadBoardDir = csStoryLeadBoardDir;
        m.e(csStoryLeadBoardDir, "csStoryLeadBoardDir");
        x.k0(csStoryLeadBoardDir, "/", false);
        String cnupStoryMainDir = file35.getCanonicalPath();
        env.cnupStoryMainDir = cnupStoryMainDir;
        m.e(cnupStoryMainDir, "cnupStoryMainDir");
        x.k0(cnupStoryMainDir, "/", false);
        String cnupStoryLeadBoardDir = file36.getCanonicalPath();
        env.cnupStoryLeadBoardDir = cnupStoryLeadBoardDir;
        m.e(cnupStoryLeadBoardDir, "cnupStoryLeadBoardDir");
        x.k0(cnupStoryLeadBoardDir, "/", false);
        String jsStoryMainDir = file37.getCanonicalPath();
        env.jsStoryMainDir = jsStoryMainDir;
        m.e(jsStoryMainDir, "jsStoryMainDir");
        x.k0(jsStoryMainDir, "/", false);
        String jsStoryLeadBoardDir = file38.getCanonicalPath();
        env.jsStoryLeadBoardDir = jsStoryLeadBoardDir;
        m.e(jsStoryLeadBoardDir, "jsStoryLeadBoardDir");
        x.k0(jsStoryLeadBoardDir, "/", false);
        String jpupStoryMainDir = file39.getCanonicalPath();
        env.jpupStoryMainDir = jpupStoryMainDir;
        m.e(jpupStoryMainDir, "jpupStoryMainDir");
        x.k0(jpupStoryMainDir, "/", false);
        String jpupStoryLeadBoardDir = file40.getCanonicalPath();
        env.jpupStoryLeadBoardDir = jpupStoryLeadBoardDir;
        m.e(jpupStoryLeadBoardDir, "jpupStoryLeadBoardDir");
        x.k0(jpupStoryLeadBoardDir, "/", false);
        String krStoryMainDir = file41.getCanonicalPath();
        env.krStoryMainDir = krStoryMainDir;
        m.e(krStoryMainDir, "krStoryMainDir");
        x.k0(krStoryMainDir, "/", false);
        String krStoryLeadBoardDir = file42.getCanonicalPath();
        env.krStoryLeadBoardDir = krStoryLeadBoardDir;
        m.e(krStoryLeadBoardDir, "krStoryLeadBoardDir");
        x.k0(krStoryLeadBoardDir, "/", false);
        String krupStoryMainDir = file43.getCanonicalPath();
        env.krupStoryMainDir = krupStoryMainDir;
        m.e(krupStoryMainDir, "krupStoryMainDir");
        x.k0(krupStoryMainDir, "/", false);
        String krupStoryLeadBoardDir = file44.getCanonicalPath();
        env.krupStoryLeadBoardDir = krupStoryLeadBoardDir;
        m.e(krupStoryLeadBoardDir, "krupStoryLeadBoardDir");
        x.k0(krupStoryLeadBoardDir, "/", false);
        String esStoryMainDir = file45.getCanonicalPath();
        env.esStoryMainDir = esStoryMainDir;
        m.e(esStoryMainDir, "esStoryMainDir");
        x.k0(esStoryMainDir, "/", false);
        String esStoryLeadBoardDir = file46.getCanonicalPath();
        env.esStoryLeadBoardDir = esStoryLeadBoardDir;
        m.e(esStoryLeadBoardDir, "esStoryLeadBoardDir");
        x.k0(esStoryLeadBoardDir, "/", false);
        String frStoryMainDir = file47.getCanonicalPath();
        env.frStoryMainDir = frStoryMainDir;
        m.e(frStoryMainDir, "frStoryMainDir");
        x.k0(frStoryMainDir, "/", false);
        String frStoryLeadBoardDir = file48.getCanonicalPath();
        env.frStoryLeadBoardDir = frStoryLeadBoardDir;
        m.e(frStoryLeadBoardDir, "frStoryLeadBoardDir");
        x.k0(frStoryLeadBoardDir, "/", false);
        String deStoryMainDir = file49.getCanonicalPath();
        env.deStoryMainDir = deStoryMainDir;
        m.e(deStoryMainDir, "deStoryMainDir");
        x.k0(deStoryMainDir, "/", false);
        String deStoryLeadBoardDir = file50.getCanonicalPath();
        env.deStoryLeadBoardDir = deStoryLeadBoardDir;
        m.e(deStoryLeadBoardDir, "deStoryLeadBoardDir");
        x.k0(deStoryLeadBoardDir, "/", false);
        String ptStoryMainDir = file51.getCanonicalPath();
        env.ptStoryMainDir = ptStoryMainDir;
        m.e(ptStoryMainDir, "ptStoryMainDir");
        x.k0(ptStoryMainDir, "/", false);
        String ptStoryLeadBoardDir = file52.getCanonicalPath();
        env.ptStoryLeadBoardDir = ptStoryLeadBoardDir;
        m.e(ptStoryLeadBoardDir, "ptStoryLeadBoardDir");
        x.k0(ptStoryLeadBoardDir, "/", false);
        String itStoryMainDir = file53.getCanonicalPath();
        env.itStoryMainDir = itStoryMainDir;
        m.e(itStoryMainDir, "itStoryMainDir");
        x.k0(itStoryMainDir, "/", false);
        String itStoryLeadBoardDir = file54.getCanonicalPath();
        env.itStoryLeadBoardDir = itStoryLeadBoardDir;
        m.e(itStoryLeadBoardDir, "itStoryLeadBoardDir");
        x.k0(itStoryLeadBoardDir, "/", false);
        String tempDir = file30.getCanonicalPath();
        env.tempDir = tempDir;
        m.e(tempDir, "tempDir");
        x.k0(tempDir, "/", false);
        String speechEvalWorkDir = file31.getCanonicalPath();
        env.speechEvalWorkDir = speechEvalWorkDir;
        m.e(speechEvalWorkDir, "speechEvalWorkDir");
        x.k0(speechEvalWorkDir, "/", false);
        String feedbackDir = file32.getCanonicalPath();
        env.feedbackDir = feedbackDir;
        m.e(feedbackDir, "feedbackDir");
        x.k0(feedbackDir, "/", false);
        if (!file2.exists() && !file2.mkdirs()) {
            throw new IOException(a.e("Can't create folder ", env.dataDir));
        }
        if (!file30.exists() && !file30.mkdirs()) {
            throw new IOException(a.e("Can't create folder ", env.tempDir));
        }
        if (!file32.exists() && !file32.mkdirs()) {
            throw new IOException(a.e("Can't create folder ", env.feedbackDir));
        }
        if (file31.exists() || file31.mkdirs()) {
            return true;
        }
        throw new IOException(a.e("Can't create folder ", env.speechEvalWorkDir));
    }
}
