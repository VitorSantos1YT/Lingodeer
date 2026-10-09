package com.google.firebase.encoders;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public interface ObjectEncoderContext {
    ObjectEncoderContext a(FieldDescriptor fieldDescriptor, boolean z11);

    ObjectEncoderContext b(FieldDescriptor fieldDescriptor, long j11);

    ObjectEncoderContext c(FieldDescriptor fieldDescriptor, int i11);

    ObjectEncoderContext d(FieldDescriptor fieldDescriptor, double d5);

    ObjectEncoderContext g(FieldDescriptor fieldDescriptor, Object obj);
}
