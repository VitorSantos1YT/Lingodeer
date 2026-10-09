package b1;

import android.graphics.Rect;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import b0.k2;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.tbruyelle.rxpermissions3.BuildConfig;
import d1.z0;
import j3.x0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import s0.s0;
import z2.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f3823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f3824b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s0 f3827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z0 f3828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p2 f3829g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Rect f3834l;
    public final t m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fz.c f3825c = new k2(17);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fz.c f3826d = new k2(18);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o3.w f3830h = new o3.w(BuildConfig.VERSION_NAME, x0.f35821b, 4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o3.j f3831i = o3.j.f44678g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f3832j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f3833k = com.bumptech.glide.d.u(qy.j.NONE, new av.d(this, 5));

    public w(View view, d dVar, p pVar) {
        this.f3823a = view;
        this.f3824b = pVar;
        this.m = new t(dVar, pVar);
    }

    public final x a(EditorInfo editorInfo) {
        int i11;
        int i12;
        o3.w wVar = this.f3830h;
        String str = wVar.f44704a.f35700b;
        long j11 = wVar.f44705b;
        o3.j jVar = this.f3831i;
        int i13 = jVar.f44683e;
        int i14 = jVar.f44682d;
        boolean z11 = jVar.f44679a;
        int i15 = 3;
        if (i13 == 1) {
            i11 = z11 ? 6 : 0;
        } else if (i13 == 0) {
            i11 = 1;
        } else if (i13 == 2) {
            i11 = 2;
        } else if (i13 == 6) {
            i11 = 5;
        } else if (i13 == 5) {
            i11 = 7;
        } else if (i13 == 3) {
            i11 = 3;
        } else if (i13 == 4) {
            i11 = 4;
        } else {
            if (i13 != 7) {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
        editorInfo.imeOptions = i11;
        q3.b bVar = jVar.f44684f;
        if (kotlin.jvm.internal.m.a(bVar, q3.b.f47418c)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(ry.n.W(bVar, 10));
            Iterator it = bVar.f47419a.iterator();
            while (it.hasNext()) {
                arrayList.add(((q3.a) it.next()).f47417a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i14 == 1) {
            i12 = 1;
        } else if (i14 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i12 = 1;
        } else if (i14 == 3) {
            i12 = 2;
        } else if (i14 == 4) {
            i12 = 3;
        } else if (i14 == 5) {
            i12 = 17;
        } else if (i14 == 6) {
            i12 = 33;
        } else if (i14 == 7) {
            i12 = 129;
        } else if (i14 == 8) {
            i12 = 18;
        } else {
            if (i14 != 9) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            i12 = 8194;
        }
        editorInfo.inputType = i12;
        if (!z11 && (i12 & 1) == 1) {
            editorInfo.inputType = 131072 | i12;
            if (jVar.f44683e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i16 = editorInfo.inputType;
        if ((i16 & 1) == 1) {
            int i17 = jVar.f44680b;
            if (i17 == 1) {
                editorInfo.inputType = i16 | 4096;
            } else if (i17 == 2) {
                editorInfo.inputType = i16 | OSSConstants.DEFAULT_BUFFER_SIZE;
            } else if (i17 == 3) {
                editorInfo.inputType = i16 | 16384;
            }
            if (jVar.f44681c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i18 = x0.f35822c;
        editorInfo.initialSelStart = (int) (j11 >> 32);
        editorInfo.initialSelEnd = (int) (j11 & 4294967295L);
        b5.c.c(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!a1.f.f279a || i14 == 7 || i14 == 8) {
            b5.c.d(editorInfo, false);
        } else {
            b5.c.d(editorInfo, true);
            l.f(editorInfo);
        }
        u uVar = v.f3822a;
        if (v5.j.d()) {
            v5.j.a().i(editorInfo);
        }
        x xVar = new x(this.f3830h, new hd.b(this, i15), this.f3831i.f44681c, this.f3827e, this.f3828f, this.f3829g);
        this.f3832j.add(new WeakReference(xVar));
        return xVar;
    }
}
