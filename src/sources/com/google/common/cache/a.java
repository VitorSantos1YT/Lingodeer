package com.google.common.cache;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.provider.MediaStore;
import android.util.SparseIntArray;
import androidx.work.impl.WorkDatabase_Impl;
import bp.g;
import bq.p;
import cf.x;
import com.adjust.sdk.Constants;
import com.airbnb.lottie.LottieAnimationView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.japanskill.ui.syllable.JPHwCharListActivity;
import com.lingo.lingoskill.object.CharGroup;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingo.lingoskill.ui.learn.adapter.BaseAudioLessonAdapter;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fb.e0;
import fb.t;
import ff.h;
import gb.a0;
import gb.b0;
import gb.r;
import gb.u;
import gb.v;
import gb.w;
import hj.g3;
import ij.i;
import ij.l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.zip.ZipInputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import la.j;
import ob.s;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16535c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f16533a = i11;
        this.f16534b = obj;
        this.f16535c = obj2;
    }

    private final Object a() {
        BaseAudioLessonAdapter baseAudioLessonAdapter = (BaseAudioLessonAdapter) this.f16534b;
        BaseViewHolder baseViewHolder = (BaseViewHolder) this.f16535c;
        if (l.f34436b == null) {
            synchronized (l.class) {
                if (l.f34436b == null) {
                    l.f34436b = new l();
                }
            }
        }
        l lVar = l.f34436b;
        m.c(lVar);
        String audio_lesson = lVar.a().getAudio_lesson();
        if (audio_lesson == null || q.K0(audio_lesson)) {
            return baseViewHolder.getBindingAdapterPosition() == 0 ? p.StateOpen : p.StateLocked;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) h.G(audio_lesson).f40184b;
        if (sparseIntArray.indexOfKey((int) baseAudioLessonAdapter.f22062a) < 0) {
            return baseViewHolder.getBindingAdapterPosition() == 0 ? p.StateOpen : p.StateLocked;
        }
        int i11 = sparseIntArray.get((int) baseAudioLessonAdapter.f22062a);
        if (i11 > baseViewHolder.getBindingAdapterPosition() + 1) {
            return p.StateRedo;
        }
        return i11 == baseViewHolder.getBindingAdapterPosition() + 1 ? p.StateOpen : p.StateLocked;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x034b  */
    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        HwCharacter hwCharacter;
        Object next;
        boolean z11 = true;
        boolean z12 = false;
        switch (this.f16533a) {
            case 0:
                throw null;
            case 1:
                FirebaseRemoteConfig firebaseRemoteConfig = (FirebaseRemoteConfig) this.f16534b;
                FirebaseRemoteConfigSettings firebaseRemoteConfigSettings = (FirebaseRemoteConfigSettings) this.f16535c;
                ConfigSharedPrefsClient configSharedPrefsClient = firebaseRemoteConfig.f20653i;
                synchronized (configSharedPrefsClient.f20764b) {
                    configSharedPrefsClient.f20763a.edit().putLong("fetch_timeout_in_seconds", firebaseRemoteConfigSettings.f20658a).putLong("minimum_fetch_interval_in_seconds", firebaseRemoteConfigSettings.f20659b).commit();
                    break;
                }
                return null;
            case 2:
                ConfigCacheClient configCacheClient = (ConfigCacheClient) this.f16534b;
                ConfigContainer configContainer = (ConfigContainer) this.f16535c;
                ConfigStorageClient configStorageClient = configCacheClient.f20692b;
                synchronized (configStorageClient) {
                    FileOutputStream fileOutputStreamOpenFileOutput = configStorageClient.f20772a.openFileOutput(configStorageClient.f20773b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(configContainer.f20696a.toString().getBytes(Constants.ENCODING));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Throwable th2) {
                        fileOutputStreamOpenFileOutput.close();
                        throw th2;
                    }
                }
                return null;
            case 3:
                w wVar = (w) this.f16534b;
                a0 a0Var = (a0) this.f16535c;
                String str = a0Var.f28896c;
                s sVar = a0Var.f28902i;
                if (wVar instanceof u) {
                    fb.u uVar = ((u) wVar).f28967a;
                    e0 e0VarM = sVar.m(str);
                    ob.m mVarD = a0Var.f28901h.D();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) mVarD.f44826b;
                    workDatabase_Impl.b();
                    ob.h hVar = (ob.h) mVarD.f44827c;
                    j jVarA = hVar.a();
                    jVarA.l(1, str);
                    try {
                        workDatabase_Impl.c();
                        try {
                            jVarA.a();
                            workDatabase_Impl.x();
                            workDatabase_Impl.s();
                            hVar.i(jVarA);
                            if (e0VarM == null) {
                                z11 = false;
                            } else if (e0VarM == e0.RUNNING) {
                                ob.p pVar = a0Var.f28894a;
                                if (uVar instanceof t) {
                                    int i11 = b0.f28906a;
                                    fb.l.b().getClass();
                                    if (pVar.d()) {
                                        a0Var.c();
                                    } else {
                                        sVar.x(e0.SUCCEEDED, str);
                                        fb.j jVar = ((t) uVar).f27109a;
                                        m.e(jVar, "success.outputData");
                                        sVar.w(str, jVar);
                                        a0Var.f28899f.getClass();
                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                        ob.c cVar = a0Var.f28903j;
                                        ArrayList arrayListO = cVar.o(str);
                                        int size = arrayListO.size();
                                        int i12 = 0;
                                        while (i12 < size) {
                                            Object obj = arrayListO.get(i12);
                                            i12++;
                                            String str2 = (String) obj;
                                            if (sVar.m(str2) == e0.BLOCKED) {
                                                w9.u uVarB = w9.u.b(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                                                uVarB.l(1, str2);
                                                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) cVar.f44799b;
                                                workDatabase_Impl2.b();
                                                Cursor cursorF = x.F(workDatabase_Impl2, uVarB, false);
                                                try {
                                                    boolean z13 = cursorF.moveToFirst() && cursorF.getInt(0) != 0;
                                                    cursorF.close();
                                                    uVarB.release();
                                                    if (z13) {
                                                        int i13 = b0.f28906a;
                                                        fb.l.b().getClass();
                                                        sVar.x(e0.ENQUEUED, str2);
                                                        sVar.v(jCurrentTimeMillis, str2);
                                                    }
                                                } catch (Throwable th3) {
                                                    cursorF.close();
                                                    uVarB.release();
                                                    throw th3;
                                                }
                                            }
                                        }
                                    }
                                } else if (uVar instanceof fb.s) {
                                    int i14 = b0.f28906a;
                                    fb.l.b().getClass();
                                    a0Var.b(-256);
                                } else {
                                    int i15 = b0.f28906a;
                                    fb.l.b().getClass();
                                    if (pVar.d()) {
                                        a0Var.c();
                                    } else {
                                        a0Var.d(uVar);
                                    }
                                }
                                z11 = false;
                            } else if (e0VarM.a()) {
                                z11 = false;
                            } else {
                                a0Var.b(-512);
                            }
                            z12 = z11;
                        } catch (Throwable th4) {
                            workDatabase_Impl.s();
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        hVar.i(jVarA);
                        throw th5;
                    }
                } else if (wVar instanceof gb.t) {
                    a0Var.d(((gb.t) wVar).f28966a);
                } else {
                    if (!(wVar instanceof v)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i16 = ((v) wVar).f28968a;
                    e0 e0VarM2 = sVar.m(str);
                    if (e0VarM2 == null || e0VarM2.a()) {
                        int i17 = b0.f28906a;
                        fb.l lVarB = fb.l.b();
                        Objects.toString(e0VarM2);
                        lVarB.getClass();
                        z11 = false;
                    } else {
                        int i18 = b0.f28906a;
                        fb.l lVarB2 = fb.l.b();
                        e0VarM2.toString();
                        lVarB2.getClass();
                        sVar.x(e0.ENQUEUED, str);
                        sVar.y(i16, str);
                        sVar.p(-1L, str);
                    }
                    z12 = z11;
                }
                return Boolean.valueOf(z12);
            case 4:
                return Long.valueOf(((i) this.f16534b).f34435a.f34448h.insertOrReplace((ReviewNew) this.f16535c));
            case 5:
                JPHwCharListActivity jPHwCharListActivity = (JPHwCharListActivity) this.f16534b;
                CharGroup charGroup = (CharGroup) this.f16535c;
                jPHwCharListActivity.Q.clear();
                for (Long l9 : charGroup.getIds()) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    if (ry.l.D(new Integer[]{1, 12}, Integer.valueOf(x.n().keyLanguage))) {
                        if (dm.c.f23488f == null) {
                            synchronized (dm.c.class) {
                                if (dm.c.f23488f == null) {
                                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                                    m.c(lingoSkillApplication2);
                                    dm.c.f23488f = new dm.c(lingoSkillApplication2);
                                }
                            }
                        }
                        dm.c cVar2 = dm.c.f23488f;
                        m.c(cVar2);
                        hwCharacter = (HwCharacter) cVar2.f().load(l9);
                    } else {
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                                    m.c(lingoSkillApplication3);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication3);
                                }
                            }
                        }
                        oi.c cVar3 = oi.c.f44924t;
                        m.c(cVar3);
                        hwCharacter = (HwCharacter) cVar3.g().load(l9);
                    }
                    if (hwCharacter != null) {
                        jPHwCharListActivity.Q.add(hwCharacter);
                    }
                    break;
                }
                return Boolean.TRUE;
            case 6:
                return a();
            case 7:
                ob.c cVar4 = (ob.c) this.f16534b;
                g gVar = (g) this.f16535c;
                CountDownLatch countDownLatch = (CountDownLatch) cVar4.f44800c;
                try {
                    cVar4.f44799b = gVar.call();
                    return null;
                } finally {
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                    }
                }
            case 8:
                String str3 = (String) this.f16534b;
                String str4 = (String) this.f16535c;
                r.Z(str3, str4);
                return str4;
            case 9:
                tp.h hVar2 = (tp.h) this.f16534b;
                String str5 = (String) this.f16535c;
                Paint paint = new Paint();
                Context contextRequireContext = hVar2.requireContext();
                m.e(contextRequireContext, "requireContext(...)");
                paint.setColor(contextRequireContext.getColor(R.color.white));
                ta.a aVar = hVar2.f36400f;
                m.c(aVar);
                int height = ((g3) aVar).f32617f.getHeight();
                ta.a aVar2 = hVar2.f36400f;
                m.c(aVar2);
                int height2 = ((g3) aVar2).f32618g.getChildAt(0).getHeight() + height;
                ta.a aVar3 = hVar2.f36400f;
                m.c(aVar3);
                int height3 = ((g3) aVar3).f32615d.getHeight() + height2;
                ta.a aVar4 = hVar2.f36400f;
                m.c(aVar4);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((g3) aVar4).f32618g.getWidth() * 2, height3 * 2, Bitmap.Config.ARGB_8888);
                m.e(bitmapCreateBitmap, "createBitmap(...)");
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.scale(2.0f, 2.0f);
                canvas.drawRect(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), paint);
                ta.a aVar5 = hVar2.f36400f;
                m.c(aVar5);
                ((g3) aVar5).f32617f.draw(canvas);
                ta.a aVar6 = hVar2.f36400f;
                m.c(aVar6);
                canvas.translate(CropImageView.DEFAULT_ASPECT_RATIO, ((g3) aVar6).f32617f.getHeight());
                ta.a aVar7 = hVar2.f36400f;
                m.c(aVar7);
                ((g3) aVar7).f32618g.draw(canvas);
                ta.a aVar8 = hVar2.f36400f;
                m.c(aVar8);
                canvas.translate(CropImageView.DEFAULT_ASPECT_RATIO, ((g3) aVar8).f32618g.getChildAt(0).getHeight());
                ta.a aVar9 = hVar2.f36400f;
                m.c(aVar9);
                ((g3) aVar9).f32615d.draw(canvas);
                String str6 = str5 + ".jpg";
                l.m mVar = hVar2.f36398d;
                MediaStore.Images.Media.insertImage(mVar != null ? mVar.getContentResolver() : null, bitmapCreateBitmap, str6, "Lingodeer");
                if (!bitmapCreateBitmap.isRecycled()) {
                    bitmapCreateBitmap.recycle();
                }
                return Boolean.TRUE;
            case 10:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f16534b;
                String str7 = (String) this.f16535c;
                if (!lottieAnimationView.L) {
                    return wc.l.b(lottieAnimationView.getContext(), str7, null);
                }
                Context context = lottieAnimationView.getContext();
                HashMap map = wc.l.f54983a;
                return wc.l.b(context, str7, "asset_" + str7);
            case 11:
                return wc.l.e(m00.b.i((InputStream) this.f16534b), (String) this.f16535c);
            case 12:
                return wc.l.h(null, (ZipInputStream) this.f16534b, (String) this.f16535c);
            default:
                HashMap map2 = (HashMap) this.f16534b;
                yi.b bVar = (yi.b) this.f16535c;
                ArrayList arrayList = new ArrayList();
                String str8 = BuildConfig.VERSION_NAME;
                for (Object obj2 : map2.entrySet()) {
                    m.e(obj2, "next(...)");
                    Map.Entry entry = (Map.Entry) obj2;
                    if (!new File(xt.b.a().b() + entry.getKey()).exists()) {
                        Object value = entry.getValue();
                        m.e(value, "<get-value>(...)");
                        Object key = entry.getKey();
                        m.e(key, "<get-key>(...)");
                        fv.a aVar10 = new fv.a(0L, (String) value, (String) key);
                        Iterator it = arrayList.iterator();
                        m.e(it, "iterator(...)");
                        do {
                            if (!it.hasNext()) {
                                str8 = str8 + (bVar.f57847b.f56095a - 1) + ":" + aVar10.f28183b + "\n";
                                arrayList.add(aVar10);
                            }
                            next = it.next();
                            m.e(next, "next(...)");
                            break;
                        } while (!((fv.a) next).equals(aVar10));
                    }
                }
                return arrayList;
        }
    }
}
