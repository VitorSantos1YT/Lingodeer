package com.github.javiersantos.piracychecker;

import android.content.Context;
import com.github.javiersantos.piracychecker.enums.Display;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class PiracyChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Display f7751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f7756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f7757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f7758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PiracyChecker$callback$1 f7759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PiracyChecker$callback$2 f7760j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PiracyCheckerDialog f7761k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f7762l;
    public final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f7763n;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i11) {
            this();
        }
    }

    static {
        new Companion(0);
    }

    public PiracyChecker(Context context) {
        String string = context.getString(com.lingodeer.R.string.app_unlicensed);
        String str = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
        string = string == null ? com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME : string;
        String string2 = context.getString(com.lingodeer.R.string.app_unlicensed_description);
        str = string2 != null ? string2 : str;
        this.f7762l = context;
        this.m = string;
        this.f7763n = str;
        this.f7754d = -1;
        this.f7756f = new String[0];
        this.f7751a = Display.DIALOG;
        this.f7757g = new ArrayList();
        this.f7758h = new ArrayList();
        this.f7752b = com.lingodeer.R.color.colorPrimary;
        this.f7753c = com.lingodeer.R.color.colorPrimaryDark;
    }
}
