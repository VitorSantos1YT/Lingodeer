package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.ProgramaticContextualTriggers;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggersFactory implements Factory<ProgramaticContextualTriggers> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProgrammaticContextualTriggerFlowableModule f20222a;

    public ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggersFactory(ProgrammaticContextualTriggerFlowableModule programmaticContextualTriggerFlowableModule) {
        this.f20222a = programmaticContextualTriggerFlowableModule;
    }

    @Override // oy.a
    public final Object get() {
        ProgramaticContextualTriggers programaticContextualTriggers = this.f20222a.f20220a;
        Preconditions.c(programaticContextualTriggers);
        return programaticContextualTriggers;
    }
}
