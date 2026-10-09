package rg;

import kotlin.jvm.internal.m;
import sg.a0;
import sg.c0;
import sg.p;
import sg.q;
import sg.x;
import sg.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f49249b = new c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f49250c = new c(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f49251d = new c(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f49252e = new c(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f49253f = new c(4);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f49254t = new c(5);
    public static final c H = new c(6);

    public /* synthetic */ c(int i11) {
        this.f49255a = i11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f49255a) {
            case 0:
                q it = (q) obj;
                m.f(it, "it");
                return Boolean.valueOf(it.f51656a instanceof p);
            case 1:
                q it2 = (q) obj;
                m.f(it2, "it");
                return Boolean.valueOf(it2.f51656a instanceof a0);
            case 2:
                q it3 = (q) obj;
                m.f(it3, "it");
                return Boolean.valueOf(it3.f51656a instanceof c0);
            case 3:
                q it4 = (q) obj;
                m.f(it4, "it");
                return Boolean.valueOf(it4.f51656a instanceof y);
            case 4:
                q it5 = (q) obj;
                m.f(it5, "it");
                return Boolean.valueOf(it5.f51656a instanceof x);
            case 5:
                q it6 = (q) obj;
                m.f(it6, "it");
                return Boolean.valueOf(it6.f51656a instanceof c0);
            default:
                q it7 = (q) obj;
                m.f(it7, "it");
                return Boolean.valueOf(it7.f51656a instanceof y);
        }
    }
}
