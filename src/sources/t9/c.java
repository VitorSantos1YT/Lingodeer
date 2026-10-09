package t9;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import ff.h;
import qy.b0;
import rz.e0;
import rz.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MeasurementManager f52117b;

    public c(MeasurementManager measurementManager) {
        this.f52117b = measurementManager;
    }

    public static Object W(c cVar, a aVar, vy.d<? super b0> dVar) {
        new m(1, ue.f.x(dVar)).s();
        MeasurementManager measurementManager = cVar.f52117b;
        throw null;
    }

    public static Object X(c cVar, vy.d<? super Integer> dVar) {
        m mVar = new m(1, ue.f.x(dVar));
        mVar.s();
        cVar.f52117b.getMeasurementApiStatus(new s.a(1), new v4.c(mVar));
        Object objR = mVar.r();
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objR;
    }

    public static Object Z(c cVar, Uri uri, InputEvent inputEvent, vy.d<? super b0> dVar) {
        m mVar = new m(1, ue.f.x(dVar));
        mVar.s();
        cVar.f52117b.registerSource(uri, inputEvent, new s.a(1), new v4.c(mVar));
        Object objR = mVar.r();
        return objR == wy.a.COROUTINE_SUSPENDED ? objR : b0.f48488a;
    }

    public static Object a0(c cVar, d dVar, vy.d<? super b0> dVar2) {
        Object objL = e0.l(new nu.b(cVar, null, 14), dVar2);
        return objL == wy.a.COROUTINE_SUSPENDED ? objL : b0.f48488a;
    }

    public static Object b0(c cVar, Uri uri, vy.d<? super b0> dVar) {
        m mVar = new m(1, ue.f.x(dVar));
        mVar.s();
        cVar.f52117b.registerTrigger(uri, new s.a(1), new v4.c(mVar));
        Object objR = mVar.r();
        return objR == wy.a.COROUTINE_SUSPENDED ? objR : b0.f48488a;
    }

    public static Object d0(c cVar, e eVar, vy.d<? super b0> dVar) {
        new m(1, ue.f.x(dVar)).s();
        MeasurementManager measurementManager = cVar.f52117b;
        throw null;
    }

    public static Object f0(c cVar, f fVar, vy.d<? super b0> dVar) {
        new m(1, ue.f.x(dVar)).s();
        MeasurementManager measurementManager = cVar.f52117b;
        throw null;
    }

    @Override // ff.h
    public Object I(Uri uri, InputEvent inputEvent, vy.d<? super b0> dVar) {
        return Z(this, uri, inputEvent, dVar);
    }

    @Override // ff.h
    public Object J(Uri uri, vy.d<? super b0> dVar) {
        return b0(this, uri, dVar);
    }

    public Object V(a aVar, vy.d<? super b0> dVar) {
        return W(this, aVar, dVar);
    }

    public Object Y(d dVar, vy.d<? super b0> dVar2) {
        return a0(this, dVar, dVar2);
    }

    public Object c0(e eVar, vy.d<? super b0> dVar) {
        return d0(this, eVar, dVar);
    }

    public Object e0(f fVar, vy.d<? super b0> dVar) {
        return f0(this, fVar, dVar);
    }

    @Override // ff.h
    public Object t(vy.d<? super Integer> dVar) {
        return X(this, dVar);
    }
}
