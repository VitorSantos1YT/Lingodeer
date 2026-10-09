package com.google.firebase.inappmessaging.display.internal.injection.modules;

import com.google.firebase.inappmessaging.display.dagger.Module;
import com.google.firebase.inappmessaging.model.MessageType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Module
public class InflaterConfigModule {

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterConfigModule$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19899a;

        static {
            int[] iArr = new int[MessageType.values().length];
            f19899a = iArr;
            try {
                iArr[MessageType.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19899a[MessageType.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19899a[MessageType.IMAGE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19899a[MessageType.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static String a(MessageType messageType, int i11) {
        if (i11 == 1) {
            int i12 = AnonymousClass1.f19899a[messageType.ordinal()];
            if (i12 == 1) {
                return "MODAL_PORTRAIT";
            }
            if (i12 == 2) {
                return "CARD_PORTRAIT";
            }
            if (i12 == 3) {
                return "IMAGE_ONLY_PORTRAIT";
            }
            if (i12 != 4) {
                return null;
            }
            return "BANNER_PORTRAIT";
        }
        int i13 = AnonymousClass1.f19899a[messageType.ordinal()];
        if (i13 == 1) {
            return "MODAL_LANDSCAPE";
        }
        if (i13 == 2) {
            return "CARD_LANDSCAPE";
        }
        if (i13 == 3) {
            return "IMAGE_ONLY_LANDSCAPE";
        }
        if (i13 != 4) {
            return null;
        }
        return "BANNER_LANDSCAPE";
    }
}
