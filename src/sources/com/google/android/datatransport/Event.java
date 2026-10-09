package com.google.android.datatransport;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Event<T> {
    public static Event f(MessagingClientEventExtension messagingClientEventExtension, ProductData productData) {
        return new AutoValue_Event(messagingClientEventExtension, Priority.DEFAULT, productData);
    }

    public static Event g(Object obj) {
        return new AutoValue_Event(obj, Priority.DEFAULT, null);
    }

    public static Event h(CrashlyticsReport crashlyticsReport) {
        return new AutoValue_Event(crashlyticsReport, Priority.HIGHEST, null);
    }

    public abstract Integer a();

    public abstract EventContext b();

    public abstract Object c();

    public abstract Priority d();

    public abstract ProductData e();
}
