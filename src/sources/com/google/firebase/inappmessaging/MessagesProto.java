package com.google.firebase.inappmessaging;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MessagesProto {

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.MessagesProto$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19713a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19713a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19713a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19713a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19713a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19713a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19713a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19713a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Action extends GeneratedMessageLite<Action, Builder> implements ActionOrBuilder {
        public static final int ACTION_URL_FIELD_NUMBER = 1;
        private static final Action DEFAULT_INSTANCE;
        private static volatile Parser<Action> PARSER;
        private String actionUrl_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Builder extends GeneratedMessageLite.Builder<Action, Builder> implements ActionOrBuilder {
            public /* synthetic */ Builder(int i11) {
                this();
            }

            private Builder() {
                super(Action.DEFAULT_INSTANCE);
            }
        }

        static {
            Action action = new Action();
            DEFAULT_INSTANCE = action;
            GeneratedMessageLite.D(Action.class, action);
        }

        private Action() {
        }

        public static Action G() {
            return DEFAULT_INSTANCE;
        }

        public final String F() {
            return this.actionUrl_;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object q(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (AnonymousClass1.f19713a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Action();
                case 2:
                    return new Builder(0);
                case 3:
                    return GeneratedMessageLite.z(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"actionUrl_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Action> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Action.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ActionOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class BannerMessage extends GeneratedMessageLite<BannerMessage, Builder> implements BannerMessageOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 4;
        public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
        public static final int BODY_FIELD_NUMBER = 2;
        private static final BannerMessage DEFAULT_INSTANCE;
        public static final int IMAGE_URL_FIELD_NUMBER = 3;
        private static volatile Parser<BannerMessage> PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 1;
        private Action action_;
        private int bitField0_;
        private Text body_;
        private Text title_;
        private String imageUrl_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
        private String backgroundHexColor_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Builder extends GeneratedMessageLite.Builder<BannerMessage, Builder> implements BannerMessageOrBuilder {
            public /* synthetic */ Builder(int i11) {
                this();
            }

            private Builder() {
                super(BannerMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            BannerMessage bannerMessage = new BannerMessage();
            DEFAULT_INSTANCE = bannerMessage;
            GeneratedMessageLite.D(BannerMessage.class, bannerMessage);
        }

        private BannerMessage() {
        }

        public static BannerMessage I() {
            return DEFAULT_INSTANCE;
        }

        public final Action F() {
            Action action = this.action_;
            return action == null ? Action.G() : action;
        }

        public final String G() {
            return this.backgroundHexColor_;
        }

        public final Text H() {
            Text text = this.body_;
            return text == null ? Text.F() : text;
        }

        public final String J() {
            return this.imageUrl_;
        }

        public final Text K() {
            Text text = this.title_;
            return text == null ? Text.F() : text;
        }

        public final boolean L() {
            return (this.bitField0_ & 4) != 0;
        }

        public final boolean M() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean N() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object q(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (AnonymousClass1.f19713a[methodToInvoke.ordinal()]) {
                case 1:
                    return new BannerMessage();
                case 2:
                    return new Builder(0);
                case 3:
                    return GeneratedMessageLite.z(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002\u0005Ȉ", new Object[]{"bitField0_", "title_", "body_", "imageUrl_", "action_", "backgroundHexColor_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BannerMessage> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (BannerMessage.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface BannerMessageOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Button extends GeneratedMessageLite<Button, Builder> implements ButtonOrBuilder {
        public static final int BUTTON_HEX_COLOR_FIELD_NUMBER = 2;
        private static final Button DEFAULT_INSTANCE;
        private static volatile Parser<Button> PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private int bitField0_;
        private String buttonHexColor_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
        private Text text_;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Builder extends GeneratedMessageLite.Builder<Button, Builder> implements ButtonOrBuilder {
            public /* synthetic */ Builder(int i11) {
                this();
            }

            private Builder() {
                super(Button.DEFAULT_INSTANCE);
            }
        }

        static {
            Button button = new Button();
            DEFAULT_INSTANCE = button;
            GeneratedMessageLite.D(Button.class, button);
        }

        private Button() {
        }

        public static Button G() {
            return DEFAULT_INSTANCE;
        }

        public final String F() {
            return this.buttonHexColor_;
        }

        public final Text H() {
            Text text = this.text_;
            return text == null ? Text.F() : text;
        }

        public final boolean I() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object q(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (AnonymousClass1.f19713a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Button();
                case 2:
                    return new Builder(0);
                case 3:
                    return GeneratedMessageLite.z(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "text_", "buttonHexColor_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Button> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Button.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ButtonOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CardMessage extends GeneratedMessageLite<CardMessage, Builder> implements CardMessageOrBuilder {
        public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
        public static final int BODY_FIELD_NUMBER = 2;
        private static final CardMessage DEFAULT_INSTANCE;
        public static final int LANDSCAPE_IMAGE_URL_FIELD_NUMBER = 4;
        private static volatile Parser<CardMessage> PARSER = null;
        public static final int PORTRAIT_IMAGE_URL_FIELD_NUMBER = 3;
        public static final int PRIMARY_ACTION_BUTTON_FIELD_NUMBER = 6;
        public static final int PRIMARY_ACTION_FIELD_NUMBER = 7;
        public static final int SECONDARY_ACTION_BUTTON_FIELD_NUMBER = 8;
        public static final int SECONDARY_ACTION_FIELD_NUMBER = 9;
        public static final int TITLE_FIELD_NUMBER = 1;
        private int bitField0_;
        private Text body_;
        private Button primaryActionButton_;
        private Action primaryAction_;
        private Button secondaryActionButton_;
        private Action secondaryAction_;
        private Text title_;
        private String portraitImageUrl_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
        private String landscapeImageUrl_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
        private String backgroundHexColor_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Builder extends GeneratedMessageLite.Builder<CardMessage, Builder> implements CardMessageOrBuilder {
            public /* synthetic */ Builder(int i11) {
                this();
            }

            private Builder() {
                super(CardMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            CardMessage cardMessage = new CardMessage();
            DEFAULT_INSTANCE = cardMessage;
            GeneratedMessageLite.D(CardMessage.class, cardMessage);
        }

        private CardMessage() {
        }

        public static CardMessage H() {
            return DEFAULT_INSTANCE;
        }

        public final String F() {
            return this.backgroundHexColor_;
        }

        public final Text G() {
            Text text = this.body_;
            return text == null ? Text.F() : text;
        }

        public final String I() {
            return this.landscapeImageUrl_;
        }

        public final String J() {
            return this.portraitImageUrl_;
        }

        public final Action K() {
            Action action = this.primaryAction_;
            return action == null ? Action.G() : action;
        }

        public final Button L() {
            Button button = this.primaryActionButton_;
            return button == null ? Button.G() : button;
        }

        public final Action M() {
            Action action = this.secondaryAction_;
            return action == null ? Action.G() : action;
        }

        public final Button N() {
            Button button = this.secondaryActionButton_;
            return button == null ? Button.G() : button;
        }

        public final Text O() {
            Text text = this.title_;
            return text == null ? Text.F() : text;
        }

        public final boolean P() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean Q() {
            return (this.bitField0_ & 8) != 0;
        }

        public final boolean R() {
            return (this.bitField0_ & 4) != 0;
        }

        public final boolean S() {
            return (this.bitField0_ & 32) != 0;
        }

        public final boolean T() {
            return (this.bitField0_ & 16) != 0;
        }

        public final boolean U() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object q(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (AnonymousClass1.f19713a[methodToInvoke.ordinal()]) {
                case 1:
                    return new CardMessage();
                case 2:
                    return new Builder(0);
                case 3:
                    return GeneratedMessageLite.z(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004\tဉ\u0005", new Object[]{"bitField0_", "title_", "body_", "portraitImageUrl_", "landscapeImageUrl_", "backgroundHexColor_", "primaryActionButton_", "primaryAction_", "secondaryActionButton_", "secondaryAction_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CardMessage> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (CardMessage.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface CardMessageOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Content extends GeneratedMessageLite<Content, Builder> implements ContentOrBuilder {
        public static final int BANNER_FIELD_NUMBER = 1;
        public static final int CARD_FIELD_NUMBER = 4;
        private static final Content DEFAULT_INSTANCE;
        public static final int IMAGE_ONLY_FIELD_NUMBER = 3;
        public static final int MODAL_FIELD_NUMBER = 2;
        private static volatile Parser<Content> PARSER;
        private int messageDetailsCase_ = 0;
        private Object messageDetails_;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Builder extends GeneratedMessageLite.Builder<Content, Builder> implements ContentOrBuilder {
            public /* synthetic */ Builder(int i11) {
                this();
            }

            private Builder() {
                super(Content.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public enum MessageDetailsCase {
            BANNER(1),
            MODAL(2),
            IMAGE_ONLY(3),
            CARD(4),
            MESSAGEDETAILS_NOT_SET(0);

            private final int value;

            MessageDetailsCase(int i11) {
                this.value = i11;
            }
        }

        static {
            Content content = new Content();
            DEFAULT_INSTANCE = content;
            GeneratedMessageLite.D(Content.class, content);
        }

        private Content() {
        }

        public static Content H() {
            return DEFAULT_INSTANCE;
        }

        public final BannerMessage F() {
            return this.messageDetailsCase_ == 1 ? (BannerMessage) this.messageDetails_ : BannerMessage.I();
        }

        public final CardMessage G() {
            return this.messageDetailsCase_ == 4 ? (CardMessage) this.messageDetails_ : CardMessage.H();
        }

        public final ImageOnlyMessage I() {
            return this.messageDetailsCase_ == 3 ? (ImageOnlyMessage) this.messageDetails_ : ImageOnlyMessage.G();
        }

        public final MessageDetailsCase J() {
            int i11 = this.messageDetailsCase_;
            if (i11 == 0) {
                return MessageDetailsCase.MESSAGEDETAILS_NOT_SET;
            }
            if (i11 == 1) {
                return MessageDetailsCase.BANNER;
            }
            if (i11 == 2) {
                return MessageDetailsCase.MODAL;
            }
            if (i11 == 3) {
                return MessageDetailsCase.IMAGE_ONLY;
            }
            if (i11 != 4) {
                return null;
            }
            return MessageDetailsCase.CARD;
        }

        public final ModalMessage K() {
            return this.messageDetailsCase_ == 2 ? (ModalMessage) this.messageDetails_ : ModalMessage.J();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object q(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (AnonymousClass1.f19713a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Content();
                case 2:
                    return new Builder(0);
                case 3:
                    return GeneratedMessageLite.z(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"messageDetails_", "messageDetailsCase_", BannerMessage.class, ModalMessage.class, ImageOnlyMessage.class, CardMessage.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Content> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Content.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ContentOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ImageOnlyMessage extends GeneratedMessageLite<ImageOnlyMessage, Builder> implements ImageOnlyMessageOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 2;
        private static final ImageOnlyMessage DEFAULT_INSTANCE;
        public static final int IMAGE_URL_FIELD_NUMBER = 1;
        private static volatile Parser<ImageOnlyMessage> PARSER;
        private Action action_;
        private int bitField0_;
        private String imageUrl_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Builder extends GeneratedMessageLite.Builder<ImageOnlyMessage, Builder> implements ImageOnlyMessageOrBuilder {
            public /* synthetic */ Builder(int i11) {
                this();
            }

            private Builder() {
                super(ImageOnlyMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            ImageOnlyMessage imageOnlyMessage = new ImageOnlyMessage();
            DEFAULT_INSTANCE = imageOnlyMessage;
            GeneratedMessageLite.D(ImageOnlyMessage.class, imageOnlyMessage);
        }

        private ImageOnlyMessage() {
        }

        public static ImageOnlyMessage G() {
            return DEFAULT_INSTANCE;
        }

        public final Action F() {
            Action action = this.action_;
            return action == null ? Action.G() : action;
        }

        public final String H() {
            return this.imageUrl_;
        }

        public final boolean I() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object q(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (AnonymousClass1.f19713a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ImageOnlyMessage();
                case 2:
                    return new Builder(0);
                case 3:
                    return GeneratedMessageLite.z(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "imageUrl_", "action_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ImageOnlyMessage> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ImageOnlyMessage.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ImageOnlyMessageOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ModalMessage extends GeneratedMessageLite<ModalMessage, Builder> implements ModalMessageOrBuilder {
        public static final int ACTION_BUTTON_FIELD_NUMBER = 4;
        public static final int ACTION_FIELD_NUMBER = 5;
        public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 6;
        public static final int BODY_FIELD_NUMBER = 2;
        private static final ModalMessage DEFAULT_INSTANCE;
        public static final int IMAGE_URL_FIELD_NUMBER = 3;
        private static volatile Parser<ModalMessage> PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 1;
        private Button actionButton_;
        private Action action_;
        private int bitField0_;
        private Text body_;
        private Text title_;
        private String imageUrl_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
        private String backgroundHexColor_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Builder extends GeneratedMessageLite.Builder<ModalMessage, Builder> implements ModalMessageOrBuilder {
            public /* synthetic */ Builder(int i11) {
                this();
            }

            private Builder() {
                super(ModalMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            ModalMessage modalMessage = new ModalMessage();
            DEFAULT_INSTANCE = modalMessage;
            GeneratedMessageLite.D(ModalMessage.class, modalMessage);
        }

        private ModalMessage() {
        }

        public static ModalMessage J() {
            return DEFAULT_INSTANCE;
        }

        public final Action F() {
            Action action = this.action_;
            return action == null ? Action.G() : action;
        }

        public final Button G() {
            Button button = this.actionButton_;
            return button == null ? Button.G() : button;
        }

        public final String H() {
            return this.backgroundHexColor_;
        }

        public final Text I() {
            Text text = this.body_;
            return text == null ? Text.F() : text;
        }

        public final String K() {
            return this.imageUrl_;
        }

        public final Text L() {
            Text text = this.title_;
            return text == null ? Text.F() : text;
        }

        public final boolean M() {
            return (this.bitField0_ & 8) != 0;
        }

        public final boolean N() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean O() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object q(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (AnonymousClass1.f19713a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ModalMessage();
                case 2:
                    return new Builder(0);
                case 3:
                    return GeneratedMessageLite.z(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002\u0005ဉ\u0003\u0006Ȉ", new Object[]{"bitField0_", "title_", "body_", "imageUrl_", "actionButton_", "action_", "backgroundHexColor_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ModalMessage> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ModalMessage.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ModalMessageOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Text extends GeneratedMessageLite<Text, Builder> implements TextOrBuilder {
        private static final Text DEFAULT_INSTANCE;
        public static final int HEX_COLOR_FIELD_NUMBER = 2;
        private static volatile Parser<Text> PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private String text_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
        private String hexColor_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Builder extends GeneratedMessageLite.Builder<Text, Builder> implements TextOrBuilder {
            public /* synthetic */ Builder(int i11) {
                this();
            }

            private Builder() {
                super(Text.DEFAULT_INSTANCE);
            }
        }

        static {
            Text text = new Text();
            DEFAULT_INSTANCE = text;
            GeneratedMessageLite.D(Text.class, text);
        }

        private Text() {
        }

        public static Text F() {
            return DEFAULT_INSTANCE;
        }

        public final String G() {
            return this.hexColor_;
        }

        public final String H() {
            return this.text_;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object q(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (AnonymousClass1.f19713a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Text();
                case 2:
                    return new Builder(0);
                case 3:
                    return GeneratedMessageLite.z(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"text_", MzwEyWCkjXL.YBIBMyMHipic});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Text> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Text.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface TextOrBuilder extends MessageLiteOrBuilder {
    }

    private MessagesProto() {
    }
}
