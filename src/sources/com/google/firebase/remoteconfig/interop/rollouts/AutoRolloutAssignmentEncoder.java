package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class AutoRolloutAssignmentEncoder implements Configurator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AutoRolloutAssignmentEncoder f20788a = new AutoRolloutAssignmentEncoder();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class RolloutAssignmentEncoder implements ObjectEncoder<RolloutAssignment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RolloutAssignmentEncoder f20789a = new RolloutAssignmentEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20790b = FieldDescriptor.a("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20791c = FieldDescriptor.a("variantId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f20792d = FieldDescriptor.a("parameterKey");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f20793e = FieldDescriptor.a("parameterValue");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f20794f = FieldDescriptor.a("templateVersion");

        private RolloutAssignmentEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f20790b, rolloutAssignment.d());
            objectEncoderContext.g(f20791c, rolloutAssignment.f());
            objectEncoderContext.g(f20792d, rolloutAssignment.b());
            objectEncoderContext.g(f20793e, rolloutAssignment.c());
            objectEncoderContext.b(f20794f, rolloutAssignment.e());
        }
    }

    private AutoRolloutAssignmentEncoder() {
    }
}
