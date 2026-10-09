package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class ProtobufValueEncoderContext implements ValueEncoderContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19665a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19666b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FieldDescriptor f19667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProtobufDataEncoderContext f19668d;

    public ProtobufValueEncoderContext(ProtobufDataEncoderContext protobufDataEncoderContext) {
        this.f19668d = protobufDataEncoderContext;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext e(String str) {
        if (this.f19665a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f19665a = true;
        this.f19668d.i(this.f19667c, str, this.f19666b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext f(boolean z11) {
        if (this.f19665a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f19665a = true;
        this.f19668d.f(this.f19667c, z11 ? 1 : 0, this.f19666b);
        return this;
    }
}
