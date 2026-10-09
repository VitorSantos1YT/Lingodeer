package com.google.firebase.database.core.view;

import com.google.firebase.database.android.AndroidEventTarget;
import com.google.firebase.database.core.Context;
import com.google.firebase.database.logging.LogWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class EventRaiser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidEventTarget f19462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LogWrapper f19463b;

    public EventRaiser(Context context) {
        this.f19462a = context.f19193b;
        this.f19463b = context.b("EventRaiser");
    }

    public final void a(List list) {
        LogWrapper logWrapper = this.f19463b;
        if (logWrapper.c()) {
            logWrapper.a("Raising " + list.size() + " event(s)", null, new Object[0]);
        }
        final ArrayList arrayList = new ArrayList(list);
        this.f19462a.f19005a.post(new Runnable() { // from class: com.google.firebase.database.core.view.EventRaiser.1
            @Override // java.lang.Runnable
            public final void run() {
                LogWrapper logWrapper2 = EventRaiser.this.f19463b;
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    Event event = (Event) obj;
                    if (logWrapper2.c()) {
                        logWrapper2.a("Raising " + event.toString(), null, new Object[0]);
                    }
                    event.a();
                }
            }
        });
    }
}
