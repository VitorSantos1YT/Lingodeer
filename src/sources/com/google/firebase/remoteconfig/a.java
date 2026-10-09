package com.google.firebase.remoteconfig;

import a0.b2;
import android.view.View;
import android.view.textclassifier.TextClassifier;
import b7.b0;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.api.Service;
import com.google.common.collect.ImmutableList;
import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.lingo.me.MeAccountSettingsActivity;
import com.yalantis.ucrop.UCropActivity;
import e9.a0;
import e9.c;
import e9.d;
import e9.d0;
import u8.i;
import x7.m;
import x7.p;
import z4.u;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements SuccessContinuation, FirebaseAppLifecycleListener, ComponentFactory, ObjectConstructor, u, i.b, p, lf.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20675a;

    public /* synthetic */ a(int i11) {
        this.f20675a = i11;
    }

    public static /* bridge */ /* synthetic */ TextClassifier a(Object obj) {
        return (TextClassifier) obj;
    }

    @Override // x7.p
    public m[] c() {
        switch (this.f20675a) {
            case 21:
                return new m[]{new d8.b()};
            case 22:
            case 23:
            default:
                return new m[]{new d0(1, i.E, new b0(0L), new b2(ImmutableList.s(), 10))};
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new m[]{new e9.a()};
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new m[]{new c()};
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new m[]{new d()};
            case 27:
                return new m[]{new a0()};
        }
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        switch (this.f20675a) {
            case 4:
                return ConstructorConstructor.lambda$newMapConstructor$14();
            case 5:
                return ConstructorConstructor.lambda$newMapConstructor$15();
            case 6:
                return ConstructorConstructor.lambda$newMapConstructor$16();
            case 7:
                return ConstructorConstructor.lambda$newMapConstructor$17();
            case 8:
                return ConstructorConstructor.lambda$newMapConstructor$18();
            case 9:
                return ConstructorConstructor.lambda$newCollectionConstructor$10();
            case 10:
                return ConstructorConstructor.lambda$newCollectionConstructor$11();
            case 11:
                return ConstructorConstructor.lambda$newCollectionConstructor$12();
            default:
                return ConstructorConstructor.lambda$newCollectionConstructor$13();
        }
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object d(ComponentContainer componentContainer) {
        switch (this.f20675a) {
            case 2:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(componentContainer);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(componentContainer);
        }
    }

    @Override // z4.u
    public v1 e(View view, v1 v1Var) {
        return UCropActivity.lambda$setupAppBar$1(view, v1Var);
    }

    @Override // i.b
    public void f(Object obj) {
        i.a it = (i.a) obj;
        int i11 = MeAccountSettingsActivity.R;
        kotlin.jvm.internal.m.f(it, "it");
    }

    @Override // lf.u
    public void h(boolean z11) {
        if (z11) {
            ve.d dVar = ve.d.f53979a;
            if (qf.a.b(ve.d.class)) {
                return;
            }
            try {
                ve.d.f53984f.set(true);
                return;
            } catch (Throwable th2) {
                qf.a.a(ve.d.class, th2);
                return;
            }
        }
        ve.d dVar2 = ve.d.f53979a;
        if (qf.a.b(ve.d.class)) {
            return;
        }
        try {
            ve.d.f53984f.set(false);
        } catch (Throwable th3) {
            qf.a.a(ve.d.class, th3);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(null);
    }
}
