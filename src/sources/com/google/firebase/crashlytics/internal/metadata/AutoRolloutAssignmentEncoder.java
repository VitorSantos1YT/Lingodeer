package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class AutoRolloutAssignmentEncoder implements Configurator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AutoRolloutAssignmentEncoder f18383a = new AutoRolloutAssignmentEncoder();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class RolloutAssignmentEncoder implements ObjectEncoder<RolloutAssignment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RolloutAssignmentEncoder f18384a = new RolloutAssignmentEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18385b = FieldDescriptor.a("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18386c = FieldDescriptor.a("parameterKey");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f18387d = FieldDescriptor.a("parameterValue");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f18388e = FieldDescriptor.a("variantId");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f18389f = FieldDescriptor.a("templateVersion");

        private RolloutAssignmentEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f18385b, rolloutAssignment.d());
            objectEncoderContext.g(f18386c, rolloutAssignment.b());
            objectEncoderContext.g(f18387d, rolloutAssignment.c());
            objectEncoderContext.g(f18388e, rolloutAssignment.f());
            objectEncoderContext.b(f18389f, rolloutAssignment.e());
        }
    }

    private AutoRolloutAssignmentEncoder() {
    }
}
