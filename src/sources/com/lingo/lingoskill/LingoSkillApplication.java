package com.lingo.lingoskill;

import android.net.Uri;
import androidx.lifecycle.MutableLiveData;
import ew.a;
import i9.b;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import kotlin.jvm.internal.m;
import qy.q;
import rz.b2;
import rz.e0;
import rz.o0;
import uu.f;
import wh.Yzt.COaVv;
import wz.d;
import yz.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LingoSkillApplication extends b implements fb.b {
    public static int H = 0;
    public static final q K;
    public static final MutableLiveData L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static LingoSkillApplication f21665b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f21666c = "default";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f21667d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Uri f21668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f21669f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static boolean f21670t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f21671a;

    static {
        Uri EMPTY = Uri.EMPTY;
        m.e(EMPTY, "EMPTY");
        f21668e = EMPTY;
        f21669f = true;
        m.e(Locale.getDefault(), "getDefault(...)");
        K = com.bumptech.glide.d.v(new f(3));
        L = new MutableLiveData();
    }

    public LingoSkillApplication() {
        b2 b2VarE = e0.e();
        yz.f fVar = o0.f50940a;
        this.f21671a = e0.c(a.w(b2VarE, e.f58387a));
        f21665b = this;
    }

    @Override // android.app.Application
    public final void onCreate() throws IllegalAccessException, InvocationTargetException {
        COaVv.eECTknxa.invoke(null, this);
    }
}
