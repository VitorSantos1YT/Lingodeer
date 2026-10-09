package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import ex.f1;
import ex.r;
import hh.c;
import uw.a;
import uw.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggerStreamFactory implements Factory<f1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProgrammaticContextualTriggerFlowableModule f20221a;

    public ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggerStreamFactory(ProgrammaticContextualTriggerFlowableModule programmaticContextualTriggerFlowableModule) {
        this.f20221a = programmaticContextualTriggerFlowableModule;
    }

    @Override // oy.a
    public final Object get() {
        ProgrammaticContextualTriggerFlowableModule programmaticContextualTriggerFlowableModule = this.f20221a;
        programmaticContextualTriggerFlowableModule.getClass();
        c cVar = new c(programmaticContextualTriggerFlowableModule, 12);
        a aVar = a.BUFFER;
        int i11 = d.f53244a;
        ax.d.a(aVar, "mode is null");
        f1 f1VarC = new r(0, cVar, aVar).c();
        f1VarC.f();
        return f1VarC;
    }
}
