package pb;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Bundle;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import ay.k0;
import b7.f0;
import cf.x;
import com.facebook.login.widget.LoginButton;
import com.google.api.Service;
import com.lingo.lingoskill.LingoSkillApplication;
import f7.v;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import lf.e0;
import lf.h0;
import qh.z;
import re.a0;
import re.b0;
import re.g0;
import re.u;
import se.y;
import y6.z0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f46728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46729c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f46727a = i11;
        this.f46728b = obj;
        this.f46729c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        Long l9;
        String str;
        Lifecycle lifecycle;
        Lifecycle.State currentState = null;
        String string = null;
        currentState = null;
        boolean z11 = false;
        switch (this.f46727a) {
            case 0:
                gb.p pVar = (gb.p) this.f46728b;
                String string2 = ((UUID) this.f46729c).toString();
                kotlin.jvm.internal.m.e(string2, "id.toString()");
                g.a(pVar, string2);
                return;
            case 1:
                ((q4.a) this.f46728b).j((Typeface) this.f46729c);
                return;
            case 2:
                ArrayList arrayList2 = (ArrayList) this.f46728b;
                a0 requests = (a0) this.f46729c;
                kotlin.jvm.internal.m.f(requests, "$requests");
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    Pair pair = (Pair) obj;
                    u uVar = (u) pair.first;
                    Object obj2 = pair.second;
                    kotlin.jvm.internal.m.e(obj2, "pair.second");
                    uVar.a((b0) obj2);
                }
                ArrayList arrayList3 = requests.f49114d;
                int size2 = arrayList3.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj3 = arrayList3.get(i12);
                    i12++;
                    re.d dVar = (re.d) obj3;
                    j4.i iVar = dVar.f49132a;
                    re.b bVar = dVar.f49133b;
                    AtomicBoolean atomicBoolean = dVar.f49134c;
                    Collection collection = dVar.f49135d;
                    Collection collection2 = dVar.f49136e;
                    Collection collection3 = dVar.f49137f;
                    AtomicBoolean atomicBoolean2 = dVar.f49138g.f49146d;
                    String str2 = (String) iVar.f35910c;
                    int i13 = iVar.f35908a;
                    Long l11 = (Long) iVar.f35911d;
                    String str3 = (String) iVar.f35912e;
                    try {
                        k0 k0Var = re.f.f49141f;
                        try {
                            if (k0Var.t().f49145c != null) {
                                re.b bVar2 = k0Var.t().f49145c;
                                arrayList = arrayList3;
                                if ((bVar2 != null ? bVar2.K : null) == bVar.K) {
                                    if (!atomicBoolean.get() && str2 == null && i13 == 0) {
                                        z11 = false;
                                        atomicBoolean2.set(false);
                                    } else {
                                        Date date = bVar.f49115a;
                                        if (iVar.f35908a != 0) {
                                            l9 = l11;
                                            str = str3;
                                            date = new Date(((long) iVar.f35908a) * 1000);
                                        } else {
                                            l9 = l11;
                                            str = str3;
                                            if (iVar.f35909b != 0) {
                                                date = new Date((((long) iVar.f35909b) * 1000) + new Date().getTime());
                                            }
                                        }
                                        Date date2 = date;
                                        if (str2 == null) {
                                            str2 = bVar.f49119e;
                                        }
                                        String str4 = str2;
                                        String str5 = bVar.H;
                                        String str6 = bVar.K;
                                        if (!atomicBoolean.get()) {
                                            collection = bVar.f49116b;
                                        }
                                        Collection collection4 = collection;
                                        if (!atomicBoolean.get()) {
                                            collection2 = bVar.f49117c;
                                        }
                                        Collection collection5 = collection2;
                                        if (!atomicBoolean.get()) {
                                            collection3 = bVar.f49118d;
                                        }
                                        k0Var.t().c(new re.b(str4, str5, str6, collection4, collection5, collection3, bVar.f49120f, date2, new Date(), l9 != null ? new Date(l9.longValue() * 1000) : bVar.L, str == null ? bVar.M : str), true);
                                        z11 = false;
                                    }
                                    arrayList3 = arrayList;
                                }
                                atomicBoolean2.set(z11);
                                arrayList3 = arrayList;
                            } else {
                                arrayList = arrayList3;
                            }
                            z11 = false;
                            atomicBoolean2.set(z11);
                            arrayList3 = arrayList;
                        } catch (Throwable th2) {
                            th = th2;
                            z11 = false;
                            atomicBoolean2.set(z11);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return;
            case 3:
                se.b accessTokenAppId = (se.b) this.f46728b;
                se.f fVar = (se.f) this.f46729c;
                if (qf.a.b(se.j.class)) {
                    return;
                }
                try {
                    kotlin.jvm.internal.m.f(accessTokenAppId, "$accessTokenAppId");
                    se.g gVar = se.j.f51601a;
                    synchronized (gVar) {
                        y yVarE = gVar.e(accessTokenAppId);
                        if (yVarE != null) {
                            yVarE.a(fVar);
                        }
                        break;
                    }
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = se.m.f51605c;
                    if (g0.k() != se.l.EXPLICIT_ONLY && se.j.f51601a.d() > 100) {
                        se.j.d(se.q.EVENT_THRESHOLD);
                        return;
                    } else {
                        if (se.j.f51603c == null) {
                            se.j.f51603c = se.j.f51602b.schedule(se.j.f51604d, 15L, TimeUnit.SECONDS);
                            return;
                        }
                        return;
                    }
                } catch (Throwable th4) {
                    qf.a.a(se.j.class, th4);
                    return;
                }
            case 4:
                se.b bVar3 = (se.b) this.f46728b;
                y yVar = (y) this.f46729c;
                if (qf.a.b(se.j.class)) {
                    return;
                }
                try {
                    se.k.z(bVar3, yVar);
                    return;
                } catch (Throwable th5) {
                    qf.a.a(se.j.class, th5);
                    return;
                }
            case 5:
                Context context = (Context) this.f46728b;
                se.m mVar = (se.m) this.f46729c;
                Bundle bundle = new Bundle();
                String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                int i14 = 0;
                for (int i15 = 0; i15 < 11; i15++) {
                    String str7 = strArr[i15];
                    String str8 = strArr2[i15];
                    try {
                        Class.forName(str7);
                        bundle.putInt(str8, 1);
                        i14 |= 1 << i15;
                    } catch (ClassNotFoundException unused) {
                    }
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                if (sharedPreferences.getInt("kitsBitmask", 0) != i14) {
                    sharedPreferences.edit().putInt("kitsBitmask", i14).apply();
                    mVar.g("fb_sdk_initialize", bundle);
                    return;
                }
                return;
            case 6:
                ((rz.m) this.f46728b).D((sz.c) this.f46729c);
                return;
            case 7:
                View view = (View) this.f46728b;
                te.d dVar2 = (te.d) this.f46729c;
                if (qf.a.b(te.d.class)) {
                    return;
                }
                try {
                    if (view instanceof EditText) {
                        dVar2.b(view);
                        return;
                    }
                    return;
                } catch (Throwable th6) {
                    qf.a.a(te.d.class, th6);
                    return;
                }
            case 8:
                tf.y this$0 = (tf.y) this.f46728b;
                Bundle bundle2 = (Bundle) this.f46729c;
                if (qf.a.b(tf.y.class)) {
                    return;
                }
                try {
                    kotlin.jvm.internal.m.f(this$0, "this$0");
                    kotlin.jvm.internal.m.f(bundle2, "$bundle");
                    this$0.f52242b.c("fb_mobile_login_heartbeat", bundle2);
                    return;
                } catch (Throwable th7) {
                    qf.a.a(tf.y.class, th7);
                    return;
                }
            case 9:
                File file = (File) this.f46728b;
                th.g gVar2 = (th.g) this.f46729c;
                int length = (int) (file.length() / ((long) 2));
                short[] sArr = new short[length];
                try {
                    DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
                    for (int i16 = 0; dataInputStream.available() > 0 && i16 < length; i16++) {
                        sArr[i16] = dataInputStream.readShort();
                    }
                    dataInputStream.close();
                    AudioTrack audioTrack = new AudioTrack(3, gVar2.f52425f, 4, 2, length, 1);
                    gVar2.f52424e = audioTrack;
                    audioTrack.setNotificationMarkerPosition(length);
                    AudioTrack audioTrack2 = gVar2.f52424e;
                    if (audioTrack2 != null) {
                        audioTrack2.setPlaybackPositionUpdateListener(new th.f(gVar2));
                    }
                    if (gVar2.f52421b) {
                        AudioTrack audioTrack3 = gVar2.f52424e;
                        if (audioTrack3 != null) {
                            audioTrack3.play();
                        }
                        AudioTrack audioTrack4 = gVar2.f52424e;
                        if (audioTrack4 != null) {
                            audioTrack4.write(sArr, 0, length);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th8) {
                    th8.printStackTrace();
                    return;
                }
            case 10:
                th.g gVar3 = (th.g) this.f46728b;
                String str9 = (String) this.f46729c;
                int i17 = gVar3.f52425f;
                File file2 = new File(str9);
                if (file2.exists()) {
                    file2.delete();
                }
                try {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    if (!new File(x.n().tempDir).exists()) {
                        new File(x.n().tempDir).mkdirs();
                    }
                    file2.createNewFile();
                    try {
                        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file2)));
                        int minBufferSize = AudioRecord.getMinBufferSize(i17, 16, 2);
                        if (gVar3.f52423d == null) {
                            gVar3.f52423d = new AudioRecord(1, i17, 16, 2, minBufferSize);
                        }
                        AudioRecord audioRecord = gVar3.f52423d;
                        if (audioRecord != null) {
                            short[] sArr2 = new short[minBufferSize];
                            audioRecord.startRecording();
                            gVar3.f52420a = true;
                            while (gVar3.f52420a) {
                                int i18 = audioRecord.read(sArr2, 0, minBufferSize);
                                for (int i19 = 0; i19 < i18; i19++) {
                                    dataOutputStream.writeShort((short) Math.min((int) (sArr2[i19] * 2.0f), 32767));
                                }
                            }
                            audioRecord.stop();
                            dataOutputStream.close();
                            return;
                        }
                        return;
                    } catch (Throwable unused2) {
                        return;
                    }
                } catch (IOException unused3) {
                    throw new IllegalStateException("未能创建" + file2);
                }
            case 11:
                ViewGroup viewGroup = (ViewGroup) this.f46728b;
                fz.a aVar = (fz.a) this.f46729c;
                LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(viewGroup);
                if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                    currentState = lifecycle.getCurrentState();
                }
                if (currentState == Lifecycle.State.DESTROYED) {
                    return;
                }
                try {
                    aVar.invoke();
                    return;
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return;
                }
            case 12:
                Integer num = (Integer) this.f46728b;
                List list = (List) this.f46729c;
                if (ry.m.i0(ue.q.f52942a, num) || !ry.m.i0(ue.q.f52943b, num)) {
                    return;
                }
                if (ue.q.f52946e >= 5) {
                    ue.q.b().clear();
                    ue.q.f52946e = 0;
                    return;
                } else {
                    ue.q.b().addAll(0, list);
                    ue.q.f52946e++;
                    return;
                }
            case 13:
                String str10 = (String) this.f46728b;
                LoginButton loginButton = (LoginButton) this.f46729c;
                int i21 = LoginButton.f7721d0;
                loginButton.getActivity().runOnUiThread(new b(14, loginButton, h0.k(str10, false)));
                return;
            case 14:
                LoginButton this$1 = (LoginButton) this.f46728b;
                e0 e0Var = (e0) this.f46729c;
                int i22 = LoginButton.f7721d0;
                kotlin.jvm.internal.m.f(this$1, "this$0");
                if (qf.a.b(this$1) || e0Var == null) {
                    return;
                }
                try {
                    if (e0Var.f39999c && this$1.getVisibility() == 0) {
                        this$1.h(e0Var.f39998b);
                        return;
                    }
                    return;
                } catch (Throwable th9) {
                    qf.a.a(this$1, th9);
                    return;
                }
            case 15:
                um.c.b((Context) this.f46728b, (fz.a) this.f46729c);
                return;
            case 16:
                ((v7.c) ((z) this.f46728b).f47797c).f53592g.a((z0) this.f46729c);
                return;
            case 17:
                qp.r rVar = (qp.r) this.f46728b;
                z0 z0Var = (z0) this.f46729c;
                f7.x xVar = (f7.x) rVar.f48146c;
                String str11 = f0.f3975a;
                f7.a0 a0Var = xVar.f26935a;
                a0Var.L0 = z0Var;
                a0Var.P.e(25, new v(z0Var));
                return;
            case 18:
                qp.r rVar2 = (qp.r) this.f46728b;
                f7.f fVar2 = (f7.f) this.f46729c;
                synchronized (fVar2) {
                }
                f7.x xVar2 = (f7.x) rVar2.f48146c;
                String str12 = f0.f3975a;
                g7.f fVar3 = xVar2.f26935a.V;
                g7.a aVarJ = fVar3.J(fVar3.f28807d.f28802e);
                fVar3.N(aVarJ, 1020, new com.google.firebase.database.android.d(aVarJ, fVar2, 26));
                return;
            case 19:
                String str13 = (String) this.f46728b;
                Bundle bundle3 = (Bundle) this.f46729c;
                if (qf.a.b(ve.c.class)) {
                    return;
                }
                try {
                    new se.m(re.s.a(), (String) null).d(str13, bundle3);
                    return;
                } catch (Throwable th10) {
                    qf.a.a(ve.c.class, th10);
                    return;
                }
            case 20:
                ve.k kVar = (ve.k) this.f46728b;
                ve.j jVar = (ve.j) this.f46729c;
                if (qf.a.b(ve.k.class)) {
                    return;
                }
                try {
                    Timer timer = kVar.f54012c;
                    if (timer != null) {
                        timer.cancel();
                    }
                    kVar.f54013d = null;
                    Timer timer2 = new Timer();
                    timer2.scheduleAtFixedRate(jVar, 0L, 1000L);
                    kVar.f54012c = timer2;
                    return;
                } catch (Exception unused4) {
                    return;
                } catch (Throwable th11) {
                    qf.a.a(ve.k.class, th11);
                    return;
                }
            case 21:
                String str14 = (String) this.f46728b;
                ve.k kVar2 = (ve.k) this.f46729c;
                if (qf.a.b(ve.k.class)) {
                    return;
                }
                try {
                    byte[] bytes = str14.getBytes(oz.a.f46133a);
                    kotlin.jvm.internal.m.e(bytes, "this as java.lang.String).getBytes(charset)");
                    try {
                        MessageDigest hash = MessageDigest.getInstance("MD5");
                        kotlin.jvm.internal.m.e(hash, "hash");
                        hash.update(bytes);
                        byte[] digest = hash.digest();
                        StringBuilder sb2 = new StringBuilder();
                        kotlin.jvm.internal.m.e(digest, "digest");
                        for (byte b3 : digest) {
                            sb2.append(Integer.toHexString((b3 >> 4) & 15));
                            sb2.append(Integer.toHexString(b3 & 15));
                        }
                        string = sb2.toString();
                        kotlin.jvm.internal.m.e(string, "builder.toString()");
                    } catch (NoSuchAlgorithmException unused5) {
                    }
                    Date date3 = re.b.N;
                    re.b bVarX = ns.o.x();
                    if (string == null || !string.equals(kVar2.f54013d)) {
                        String str15 = ve.k.f54009e;
                        kVar2.b(android.support.v4.media.session.a.f(str14, bVarX, re.s.b()), string);
                        return;
                    }
                    return;
                } catch (Throwable th12) {
                    qf.a.a(ve.k.class, th12);
                    return;
                }
            case 22:
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) this.f46728b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f46729c;
                SurfaceTexture surfaceTexture2 = sphericalGLSurfaceView.f2153t;
                Surface surface = sphericalGLSurfaceView.H;
                Surface surface2 = new Surface(surfaceTexture);
                sphericalGLSurfaceView.f2153t = surfaceTexture;
                sphericalGLSurfaceView.H = surface2;
                Iterator it = sphericalGLSurfaceView.f2147a.iterator();
                while (it.hasNext()) {
                    ((f7.x) it.next()).f26935a.J0(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 23:
                Runnable runnable = (Runnable) this.f46728b;
                j jVar2 = (j) this.f46729c;
                try {
                    runnable.run();
                    return;
                } finally {
                    jVar2.a();
                }
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                Context context2 = (Context) this.f46728b;
                b7.f fVar4 = (b7.f) this.f46729c;
                z6.c.f58933a = (AudioManager) context2.getSystemService("audio");
                fVar4.c();
                return;
            default:
                ((zz.h) ((zz.i) this.f46728b)).g((zz.b) this.f46729c, qy.b0.f48488a);
                return;
        }
    }
}
