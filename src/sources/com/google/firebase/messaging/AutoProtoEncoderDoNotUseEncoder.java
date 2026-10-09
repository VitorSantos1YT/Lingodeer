package com.google.firebase.messaging;

import b7.e0;
import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AutoProtoEncoderDoNotUseEncoder f20429a = new AutoProtoEncoderDoNotUseEncoder();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class MessagingClientEventEncoder implements ObjectEncoder<MessagingClientEvent> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MessagingClientEventEncoder f20430a = new MessagingClientEventEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20432c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f20433d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f20434e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f20435f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f20436g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f20437h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final FieldDescriptor f20438i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final FieldDescriptor f20439j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final FieldDescriptor f20440k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final FieldDescriptor f20441l;
        public static final FieldDescriptor m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final FieldDescriptor f20442n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final FieldDescriptor f20443o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final FieldDescriptor f20444p;

        private MessagingClientEventEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            MessagingClientEvent messagingClientEvent = (MessagingClientEvent) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.b(f20431b, messagingClientEvent.f20605a);
            objectEncoderContext.g(f20432c, messagingClientEvent.f20606b);
            objectEncoderContext.g(f20433d, messagingClientEvent.f20607c);
            objectEncoderContext.g(f20434e, messagingClientEvent.f20608d);
            objectEncoderContext.g(f20435f, messagingClientEvent.f20609e);
            objectEncoderContext.g(f20436g, messagingClientEvent.f20610f);
            objectEncoderContext.g(f20437h, messagingClientEvent.f20611g);
            objectEncoderContext.c(f20438i, messagingClientEvent.f20612h);
            objectEncoderContext.c(f20439j, messagingClientEvent.f20613i);
            objectEncoderContext.g(f20440k, messagingClientEvent.f20614j);
            objectEncoderContext.b(f20441l, 0L);
            objectEncoderContext.g(m, messagingClientEvent.f20615k);
            objectEncoderContext.g(f20442n, messagingClientEvent.f20616l);
            objectEncoderContext.b(f20443o, 0L);
            objectEncoderContext.g(f20444p, messagingClientEvent.m);
        }

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("projectNumber");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f19643a = 1;
            f20431b = e0.h(atProtobuf, builder);
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("messageId");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f19643a = 2;
            f20432c = e0.h(atProtobuf2, builder2);
            FieldDescriptor.Builder builder3 = new FieldDescriptor.Builder("instanceId");
            AtProtobuf atProtobuf3 = new AtProtobuf();
            atProtobuf3.f19643a = 3;
            f20433d = e0.h(atProtobuf3, builder3);
            FieldDescriptor.Builder builder4 = new FieldDescriptor.Builder("messageType");
            AtProtobuf atProtobuf4 = new AtProtobuf();
            atProtobuf4.f19643a = 4;
            f20434e = e0.h(atProtobuf4, builder4);
            FieldDescriptor.Builder builder5 = new FieldDescriptor.Builder("sdkPlatform");
            AtProtobuf atProtobuf5 = new AtProtobuf();
            atProtobuf5.f19643a = 5;
            f20435f = e0.h(atProtobuf5, builder5);
            FieldDescriptor.Builder builder6 = new FieldDescriptor.Builder("packageName");
            AtProtobuf atProtobuf6 = new AtProtobuf();
            atProtobuf6.f19643a = 6;
            f20436g = e0.h(atProtobuf6, builder6);
            FieldDescriptor.Builder builder7 = new FieldDescriptor.Builder("collapseKey");
            AtProtobuf atProtobuf7 = new AtProtobuf();
            atProtobuf7.f19643a = 7;
            f20437h = e0.h(atProtobuf7, builder7);
            FieldDescriptor.Builder builder8 = new FieldDescriptor.Builder("priority");
            AtProtobuf atProtobuf8 = new AtProtobuf();
            atProtobuf8.f19643a = 8;
            f20438i = e0.h(atProtobuf8, builder8);
            FieldDescriptor.Builder builder9 = new FieldDescriptor.Builder("ttl");
            AtProtobuf atProtobuf9 = new AtProtobuf();
            atProtobuf9.f19643a = 9;
            f20439j = e0.h(atProtobuf9, builder9);
            FieldDescriptor.Builder builder10 = new FieldDescriptor.Builder(ualZoVVCQs.puoBBa);
            AtProtobuf atProtobuf10 = new AtProtobuf();
            atProtobuf10.f19643a = 10;
            f20440k = e0.h(atProtobuf10, builder10);
            FieldDescriptor.Builder builder11 = new FieldDescriptor.Builder("bulkId");
            AtProtobuf atProtobuf11 = new AtProtobuf();
            atProtobuf11.f19643a = 11;
            f20441l = e0.h(atProtobuf11, builder11);
            FieldDescriptor.Builder builder12 = new FieldDescriptor.Builder("event");
            AtProtobuf atProtobuf12 = new AtProtobuf();
            atProtobuf12.f19643a = 12;
            m = e0.h(atProtobuf12, builder12);
            FieldDescriptor.Builder builder13 = new FieldDescriptor.Builder("analyticsLabel");
            AtProtobuf atProtobuf13 = new AtProtobuf();
            atProtobuf13.f19643a = 13;
            f20442n = e0.h(atProtobuf13, builder13);
            FieldDescriptor.Builder builder14 = new FieldDescriptor.Builder("campaignId");
            AtProtobuf atProtobuf14 = new AtProtobuf();
            atProtobuf14.f19643a = 14;
            f20443o = e0.h(atProtobuf14, builder14);
            FieldDescriptor.Builder builder15 = new FieldDescriptor.Builder("composerLabel");
            AtProtobuf atProtobuf15 = new AtProtobuf();
            atProtobuf15.f19643a = 15;
            f20444p = e0.h(atProtobuf15, builder15);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class MessagingClientEventExtensionEncoder implements ObjectEncoder<MessagingClientEventExtension> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MessagingClientEventExtensionEncoder f20445a = new MessagingClientEventExtensionEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20446b;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("messagingClientEvent");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f19643a = 1;
            f20446b = e0.h(atProtobuf, builder);
        }

        private MessagingClientEventExtensionEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).g(f20446b, ((MessagingClientEventExtension) obj).f20630a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ProtoEncoderDoNotUseEncoder implements ObjectEncoder<ProtoEncoderDoNotUse> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProtoEncoderDoNotUseEncoder f20447a = new ProtoEncoderDoNotUseEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20448b = FieldDescriptor.a("messagingClientEventExtension");

        private ProtoEncoderDoNotUseEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).g(f20448b, ((ProtoEncoderDoNotUse) obj).a());
        }
    }

    private AutoProtoEncoderDoNotUseEncoder() {
    }
}
