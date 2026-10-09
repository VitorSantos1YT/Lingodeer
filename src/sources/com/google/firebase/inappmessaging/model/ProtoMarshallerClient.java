package com.google.firebase.inappmessaging.model;

import android.text.TextUtils;
import com.google.common.base.Preconditions;
import com.google.firebase.inappmessaging.MessagesProto;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ProtoMarshallerClient {

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.model.ProtoMarshallerClient$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends InAppMessage {
    }

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.model.ProtoMarshallerClient$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20334a;

        static {
            int[] iArr = new int[MessagesProto.Content.MessageDetailsCase.values().length];
            f20334a = iArr;
            try {
                iArr[MessagesProto.Content.MessageDetailsCase.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20334a[MessagesProto.Content.MessageDetailsCase.IMAGE_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20334a[MessagesProto.Content.MessageDetailsCase.MODAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20334a[MessagesProto.Content.MessageDetailsCase.CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static Action.Builder a(MessagesProto.Action action) {
        Action.Builder builder = new Action.Builder();
        if (!TextUtils.isEmpty(action.F())) {
            String strF = action.F();
            if (!TextUtils.isEmpty(strF)) {
                builder.f20275a = strF;
            }
        }
        return builder;
    }

    public static Action b(MessagesProto.Action action, MessagesProto.Button button) {
        Action.Builder builderA = a(action);
        if (!button.equals(MessagesProto.Button.G())) {
            Button.Builder builder = new Button.Builder();
            if (!TextUtils.isEmpty(button.F())) {
                builder.f20297b = button.F();
            }
            if (button.I()) {
                Text.Builder builder2 = new Text.Builder();
                MessagesProto.Text textH = button.H();
                if (!TextUtils.isEmpty(textH.H())) {
                    builder2.f20338a = textH.H();
                }
                if (!TextUtils.isEmpty(textH.G())) {
                    builder2.f20339b = textH.G();
                }
                if (TextUtils.isEmpty(builder2.f20339b)) {
                    throw new IllegalArgumentException("Text model must have a color");
                }
                builder.f20296a = new Text(builder2.f20338a, builder2.f20339b);
            }
            if (TextUtils.isEmpty(builder.f20297b)) {
                throw new IllegalArgumentException("Button model must have a color");
            }
            Text text = builder.f20296a;
            if (text == null) {
                throw new IllegalArgumentException("Button model must have text");
            }
            builderA.f20276b = new Button(text, builder.f20297b);
        }
        return new Action(builderA.f20275a, builderA.f20276b);
    }

    public static InAppMessage c(MessagesProto.Content content, String str, String str2, boolean z11, Map map) {
        Preconditions.k(content, "FirebaseInAppMessaging content cannot be null.");
        Preconditions.k(str, "FirebaseInAppMessaging campaign id cannot be null.");
        Preconditions.k(str2, "FirebaseInAppMessaging campaign name cannot be null.");
        content.toString();
        CampaignMetadata campaignMetadata = new CampaignMetadata(str, str2, z11);
        int i11 = AnonymousClass2.f20334a[content.J().ordinal()];
        if (i11 == 1) {
            MessagesProto.BannerMessage bannerMessageF = content.F();
            BannerMessage.Builder builder = new BannerMessage.Builder();
            if (!TextUtils.isEmpty(bannerMessageF.G())) {
                builder.f20293e = bannerMessageF.G();
            }
            if (!TextUtils.isEmpty(bannerMessageF.J())) {
                ImageData.Builder builder2 = new ImageData.Builder();
                String strJ = bannerMessageF.J();
                if (!TextUtils.isEmpty(strJ)) {
                    builder2.f20316a = strJ;
                }
                builder.f20291c = builder2.a();
            }
            if (bannerMessageF.L()) {
                Action.Builder builderA = a(bannerMessageF.F());
                builder.f20292d = new Action(builderA.f20275a, builderA.f20276b);
            }
            if (bannerMessageF.M()) {
                builder.f20290b = d(bannerMessageF.H());
            }
            if (bannerMessageF.N()) {
                builder.f20289a = d(bannerMessageF.K());
            }
            if (builder.f20289a == null) {
                throw new IllegalArgumentException("Banner model must have a title");
            }
            if (TextUtils.isEmpty(builder.f20293e)) {
                throw new IllegalArgumentException("Banner model must have a background color");
            }
            return new BannerMessage(campaignMetadata, builder.f20289a, builder.f20290b, builder.f20291c, builder.f20292d, builder.f20293e, map);
        }
        if (i11 == 2) {
            MessagesProto.ImageOnlyMessage imageOnlyMessageI = content.I();
            ImageOnlyMessage.Builder builder3 = new ImageOnlyMessage.Builder();
            if (!TextUtils.isEmpty(imageOnlyMessageI.H())) {
                ImageData.Builder builder4 = new ImageData.Builder();
                String strH = imageOnlyMessageI.H();
                if (!TextUtils.isEmpty(strH)) {
                    builder4.f20316a = strH;
                }
                builder3.f20319a = builder4.a();
            }
            if (imageOnlyMessageI.I()) {
                Action.Builder builderA2 = a(imageOnlyMessageI.F());
                builder3.f20320b = new Action(builderA2.f20275a, builderA2.f20276b);
            }
            ImageData imageData = builder3.f20319a;
            if (imageData == null) {
                throw new IllegalArgumentException("ImageOnly model must have image data");
            }
            Action action = builder3.f20320b;
            ImageOnlyMessage imageOnlyMessage = new ImageOnlyMessage(campaignMetadata, MessageType.IMAGE_ONLY, map);
            imageOnlyMessage.f20317d = imageData;
            imageOnlyMessage.f20318e = action;
            return imageOnlyMessage;
        }
        if (i11 == 3) {
            MessagesProto.ModalMessage modalMessageK = content.K();
            ModalMessage.Builder builder5 = new ModalMessage.Builder();
            if (!TextUtils.isEmpty(modalMessageK.H())) {
                builder5.f20333e = modalMessageK.H();
            }
            if (!TextUtils.isEmpty(modalMessageK.K())) {
                ImageData.Builder builder6 = new ImageData.Builder();
                String strK = modalMessageK.K();
                if (!TextUtils.isEmpty(strK)) {
                    builder6.f20316a = strK;
                }
                builder5.f20331c = builder6.a();
            }
            if (modalMessageK.M()) {
                builder5.f20332d = b(modalMessageK.F(), modalMessageK.G());
            }
            if (modalMessageK.N()) {
                builder5.f20330b = d(modalMessageK.I());
            }
            if (modalMessageK.O()) {
                builder5.f20329a = d(modalMessageK.L());
            }
            if (builder5.f20329a == null) {
                throw new IllegalArgumentException("Modal model must have a title");
            }
            Action action2 = builder5.f20332d;
            if (action2 != null && action2.f20274b == null) {
                throw new IllegalArgumentException("Modal model action must be null or have a button");
            }
            if (TextUtils.isEmpty(builder5.f20333e)) {
                throw new IllegalArgumentException("Modal model must have a background color");
            }
            return new ModalMessage(campaignMetadata, builder5.f20329a, builder5.f20330b, builder5.f20331c, builder5.f20332d, builder5.f20333e, map);
        }
        if (i11 != 4) {
            return new AnonymousClass1(new CampaignMetadata(str, str2, z11), MessageType.UNSUPPORTED, map);
        }
        MessagesProto.CardMessage cardMessageG = content.G();
        CardMessage.Builder builder7 = new CardMessage.Builder();
        if (cardMessageG.U()) {
            builder7.f20312e = d(cardMessageG.O());
        }
        if (cardMessageG.P()) {
            builder7.f20313f = d(cardMessageG.G());
        }
        if (!TextUtils.isEmpty(cardMessageG.F())) {
            builder7.f20310c = cardMessageG.F();
        }
        if (cardMessageG.Q() || cardMessageG.R()) {
            builder7.f20311d = b(cardMessageG.K(), cardMessageG.L());
        }
        if (cardMessageG.S() || cardMessageG.T()) {
            builder7.f20314g = b(cardMessageG.M(), cardMessageG.N());
        }
        if (!TextUtils.isEmpty(cardMessageG.J())) {
            ImageData.Builder builder8 = new ImageData.Builder();
            String strJ2 = cardMessageG.J();
            if (!TextUtils.isEmpty(strJ2)) {
                builder8.f20316a = strJ2;
            }
            builder7.f20308a = builder8.a();
        }
        if (!TextUtils.isEmpty(cardMessageG.I())) {
            ImageData.Builder builder9 = new ImageData.Builder();
            String strI = cardMessageG.I();
            if (!TextUtils.isEmpty(strI)) {
                builder9.f20316a = strI;
            }
            builder7.f20309b = builder9.a();
        }
        Action action3 = builder7.f20311d;
        if (action3 == null) {
            throw new IllegalArgumentException("Card model must have a primary action");
        }
        if (action3.f20274b == null) {
            throw new IllegalArgumentException("Card model must have a primary action button");
        }
        Action action4 = builder7.f20314g;
        if (action4 != null && action4.f20274b == null) {
            throw new IllegalArgumentException("Card model secondary action must be null or have a button");
        }
        if (builder7.f20312e == null) {
            throw new IllegalArgumentException("Card model must have a title");
        }
        if (builder7.f20308a == null && builder7.f20309b == null) {
            throw new IllegalArgumentException("Card model must have at least one image");
        }
        if (TextUtils.isEmpty(builder7.f20310c)) {
            throw new IllegalArgumentException("Card model must have a background color");
        }
        return new CardMessage(campaignMetadata, builder7.f20312e, builder7.f20313f, builder7.f20308a, builder7.f20309b, builder7.f20310c, builder7.f20311d, builder7.f20314g, map);
    }

    public static Text d(MessagesProto.Text text) {
        Text.Builder builder = new Text.Builder();
        if (!TextUtils.isEmpty(text.G())) {
            builder.f20339b = text.G();
        }
        if (!TextUtils.isEmpty(text.H())) {
            builder.f20338a = text.H();
        }
        if (TextUtils.isEmpty(builder.f20339b)) {
            throw new IllegalArgumentException("Text model must have a color");
        }
        return new Text(builder.f20338a, builder.f20339b);
    }
}
