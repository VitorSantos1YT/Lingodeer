package se;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends ObjectInputStream {
    @Override // java.io.ObjectInputStream
    public final ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
        ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
        if (kotlin.jvm.internal.m.a(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
            resultClassDescriptor = ObjectStreamClass.lookup(a.class);
        } else if (kotlin.jvm.internal.m.a(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
            resultClassDescriptor = ObjectStreamClass.lookup(e.class);
        }
        kotlin.jvm.internal.m.e(resultClassDescriptor, "resultClassDescriptor");
        return resultClassDescriptor;
    }
}
