package com.google.firebase.tracing;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.e;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ComponentMonitor implements ComponentRegistrarProcessor {
    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public final List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (Component component : componentRegistrar.getComponents()) {
            String str = component.f18084a;
            if (str != null) {
                component = new Component(str, component.f18085b, component.f18086c, component.f18087d, component.f18088e, new e(16, str, component), component.f18090g);
            }
            arrayList.add(component);
        }
        return arrayList;
    }
}
