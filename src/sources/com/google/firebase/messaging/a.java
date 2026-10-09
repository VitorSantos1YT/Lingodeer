package com.google.firebase.messaging;

import com.google.android.datatransport.Transformer;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Continuation, Transformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20571a;

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        MessagingClientEventExtension messagingClientEventExtension = (MessagingClientEventExtension) obj;
        messagingClientEventExtension.getClass();
        ProtobufEncoder protobufEncoder = ProtoEncoderDoNotUse.f20503a;
        protobufEncoder.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            protobufEncoder.a(messagingClientEventExtension, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i11;
        switch (this.f20571a) {
            case 1:
                i11 = 403;
                break;
            default:
                i11 = -1;
                break;
        }
        return Integer.valueOf(i11);
    }
}
