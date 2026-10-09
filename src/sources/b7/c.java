package b7;

import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.widget.ImageView;
import com.lingodeer.data.env.Env;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;
import java.util.UUID;
import y.j0;
import y.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3963f;

    public c(Env env) {
        kotlin.jvm.internal.m.f(env, "env");
        this.f3959b = new Handler();
        this.f3963f = new b2.a(this, 2);
        this.f3962e = new bq.f(0, false);
        this.f3961d = defpackage.e.m(env.tempDir, "recorder.3gp");
        bq.f fVar = (bq.f) this.f3962e;
        kotlin.jvm.internal.m.c(fVar);
        fVar.f4944b = new av.d(this, 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r9 < r2.f6716b) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r9, b7.w r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f3961d
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r1 = r8.f3962e
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            int r2 = r8.f3958a
            if (r2 == 0) goto L9e
            r3 = -1
            if (r2 == r3) goto L27
            int r2 = r1.size()
            int r4 = r8.f3958a
            if (r2 < r4) goto L27
            java.lang.Object r2 = r1.peek()
            c7.t r2 = (c7.t) r2
            java.lang.String r4 = b7.f0.f3975a
            long r4 = r2.f6716b
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 >= 0) goto L27
            goto L9e
        L27:
            java.lang.Object r2 = r8.f3960c
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L37
            b7.w r2 = new b7.w
            r2.<init>()
            goto L3d
        L37:
            java.lang.Object r2 = r2.pop()
            b7.w r2 = (b7.w) r2
        L3d:
            int r4 = r11.a()
            r2.F(r4)
            byte[] r4 = r11.f4039a
            int r11 = r11.f4040b
            byte[] r5 = r2.f4039a
            int r6 = r2.a()
            r7 = 0
            java.lang.System.arraycopy(r4, r11, r5, r7, r6)
            java.lang.Object r11 = r8.f3963f
            c7.t r11 = (c7.t) r11
            if (r11 == 0) goto L64
            long r4 = r11.f6716b
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 != 0) goto L64
            java.util.ArrayList r9 = r11.f6715a
            r9.add(r2)
            return
        L64:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L70
            c7.t r11 = new c7.t
            r11.<init>()
            goto L76
        L70:
            java.lang.Object r11 = r0.pop()
            c7.t r11 = (c7.t) r11
        L76:
            java.util.ArrayList r0 = r11.f6715a
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 == 0) goto L82
            r7 = 1
        L82:
            b7.a.d(r7)
            boolean r4 = r0.isEmpty()
            b7.a.j(r4)
            r11.f6716b = r9
            r0.add(r2)
            r1.add(r11)
            r8.f3963f = r11
            int r9 = r8.f3958a
            if (r9 == r3) goto L9d
            r8.b(r9)
        L9d:
            return
        L9e:
            java.lang.Object r0 = r8.f3959b
            c7.u r0 = (c7.u) r0
            r0.b(r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.c.a(long, b7.w):void");
    }

    public void b(int i11) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.f3962e;
        while (priorityQueue.size() > i11) {
            c7.t tVar = (c7.t) priorityQueue.poll();
            String str = f0.f3975a;
            int i12 = 0;
            while (true) {
                arrayList = tVar.f6715a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                ((c7.u) this.f3959b).b(tVar.f6716b, (w) arrayList.get(i12));
                ((ArrayDeque) this.f3960c).push((w) arrayList.get(i12));
                i12++;
            }
            arrayList.clear();
            c7.t tVar2 = (c7.t) this.f3963f;
            if (tVar2 != null && tVar2.f6716b == tVar.f6716b) {
                this.f3963f = null;
            }
            ((ArrayDeque) this.f3961d).push(tVar);
        }
    }

    public j9.p c(String route) {
        j9.o oVar;
        kotlin.jvm.internal.m.f(route, "route");
        qy.q qVar = (qy.q) this.f3963f;
        if (qVar == null || (oVar = (j9.o) qVar.getValue()) == null) {
            return null;
        }
        int i11 = j9.q.f36240e;
        String uriString = "android-app://androidx.navigation/".concat(route);
        kotlin.jvm.internal.m.f(uriString, "uriString");
        Uri uri = Uri.parse(uriString);
        kotlin.jvm.internal.m.e(uri, "parse(...)");
        Bundle bundleD = oVar.d(uri, (LinkedHashMap) this.f3961d);
        if (bundleD == null) {
            return null;
        }
        return new j9.p((j9.q) this.f3959b, bundleD, oVar.f36234l, oVar.b(uri), false);
    }

    public void d(Runnable runnable) {
        a0 a0Var = (a0) this.f3959b;
        if (a0Var.f3950a.getLooper().getThread().isAlive()) {
            a0Var.c(runnable);
        }
    }

    public void e(int i11) {
        a.j(i11 >= 0);
        this.f3958a = i11;
        b(i11);
    }

    public void f(ImageView imageView, bq.w wVar) {
        this.f3960c = imageView;
        android.support.v4.media.session.a.H(imageView.getBackground());
        imageView.setOnClickListener(new bq.x(0, this, wVar));
    }

    public void g() {
        bq.f fVar = (bq.f) this.f3962e;
        if (fVar != null) {
            kotlin.jvm.internal.m.c(fVar);
            fVar.t();
        }
    }

    public void h() {
        int iLog10;
        bq.f fVar = (bq.f) this.f3962e;
        if (fVar == null || !fVar.f4943a) {
            return;
        }
        kotlin.jvm.internal.m.c(fVar);
        MediaRecorder mediaRecorder = (MediaRecorder) fVar.f4945c;
        kotlin.jvm.internal.m.c(mediaRecorder);
        int maxAmplitude = mediaRecorder.getMaxAmplitude() / 600;
        if (maxAmplitude > 1) {
            iLog10 = (int) (Math.log10(maxAmplitude) * ((double) 20));
        } else {
            iLog10 = 0;
        }
        int i11 = iLog10 % 15;
        ImageView imageView = (ImageView) this.f3960c;
        kotlin.jvm.internal.m.c(imageView);
        Drawable background = imageView.getBackground();
        kotlin.jvm.internal.m.d(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        AnimationDrawable animationDrawable = (AnimationDrawable) background;
        if (i11 == 0) {
            i11 = 1;
        }
        int i12 = this.f3958a;
        if (i11 < i12) {
            i11 = i12 - 1;
        }
        animationDrawable.selectDrawable(i11);
        this.f3958a = i11;
        ((Handler) this.f3959b).postDelayed((b2.a) this.f3963f, 50L);
    }

    public void i(Object obj) {
        Object obj2 = this.f3962e;
        this.f3962e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        f7.a0 a0Var = ((f7.r) this.f3961d).f26900a;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        a0Var.Q0();
        a0Var.F0(1, 10, num);
        a0Var.F0(2, 10, num);
        a0Var.P.e(21, new com.yalantis.ucrop.a(iIntValue, 2));
    }

    public void j() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(re.s.a()).edit();
        Long l9 = (Long) this.f3959b;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l9 != null ? l9.longValue() : 0L);
        Long l11 = (Long) this.f3960c;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l11 != null ? l11.longValue() : 0L);
        editorEdit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f3958a);
        editorEdit.putString("com.facebook.appevents.SessionInfo.sessionId", ((UUID) this.f3961d).toString());
        editorEdit.apply();
        ef.o oVar = (ef.o) this.f3963f;
        if (oVar == null || oVar == null) {
            return;
        }
        SharedPreferences.Editor editorEdit2 = PreferenceManager.getDefaultSharedPreferences(re.s.a()).edit();
        editorEdit2.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", oVar.f25528b);
        editorEdit2.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", oVar.f25529c);
        editorEdit2.apply();
    }

    public c(Long l9, Long l11) {
        UUID uuidRandomUUID = UUID.randomUUID();
        kotlin.jvm.internal.m.e(uuidRandomUUID, "randomUUID()");
        this.f3959b = l9;
        this.f3960c = l11;
        this.f3961d = uuidRandomUUID;
    }

    public c(c7.u uVar) {
        this.f3959b = uVar;
        this.f3960c = new ArrayDeque();
        this.f3961d = new ArrayDeque();
        this.f3962e = new PriorityQueue();
        this.f3958a = -1;
    }

    public c() {
        this.f3959b = new w2.p[32];
        this.f3960c = new float[32];
        this.f3961d = new byte[32];
        j0 j0Var = s0.f56760a;
        this.f3962e = new j0();
        this.f3963f = new j0();
    }
}
