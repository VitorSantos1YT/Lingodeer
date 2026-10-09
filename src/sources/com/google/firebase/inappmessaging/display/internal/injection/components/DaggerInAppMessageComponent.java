package com.google.firebase.inappmessaging.display.internal.injection.components;

import com.google.firebase.inappmessaging.display.dagger.internal.DoubleCheck;
import com.google.firebase.inappmessaging.display.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.display.dagger.internal.Provider;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.BannerBindingWrapper;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.BannerBindingWrapper_Factory;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.CardBindingWrapper;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.CardBindingWrapper_Factory;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.ImageBindingWrapper;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.ImageBindingWrapper_Factory;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.ModalBindingWrapper;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.ModalBindingWrapper_Factory;
import com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterModule;
import com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterModule_InAppMessageLayoutConfigFactory;
import com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterModule_ProvidesBannerMessageFactory;
import com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterModule_ProvidesInflaterserviceFactory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DaggerInAppMessageComponent {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InflaterModule f19872a;

        public /* synthetic */ Builder(int i11) {
            this();
        }

        public final InAppMessageComponent a() {
            Preconditions.a(InflaterModule.class, this.f19872a);
            InflaterModule inflaterModule = this.f19872a;
            InAppMessageComponentImpl inAppMessageComponentImpl = new InAppMessageComponentImpl();
            inAppMessageComponentImpl.f19873a = DoubleCheck.a(new InflaterModule_InAppMessageLayoutConfigFactory(inflaterModule));
            Provider providerA = DoubleCheck.a(new InflaterModule_ProvidesInflaterserviceFactory(inflaterModule));
            inAppMessageComponentImpl.f19874b = providerA;
            InflaterModule_ProvidesBannerMessageFactory inflaterModule_ProvidesBannerMessageFactory = new InflaterModule_ProvidesBannerMessageFactory(inflaterModule);
            inAppMessageComponentImpl.f19875c = inflaterModule_ProvidesBannerMessageFactory;
            inAppMessageComponentImpl.f19876d = DoubleCheck.a(new ImageBindingWrapper_Factory(inAppMessageComponentImpl.f19873a, providerA, inflaterModule_ProvidesBannerMessageFactory));
            inAppMessageComponentImpl.f19877e = DoubleCheck.a(new ModalBindingWrapper_Factory(inAppMessageComponentImpl.f19873a, inAppMessageComponentImpl.f19874b, inAppMessageComponentImpl.f19875c));
            inAppMessageComponentImpl.f19878f = DoubleCheck.a(new BannerBindingWrapper_Factory(inAppMessageComponentImpl.f19873a, inAppMessageComponentImpl.f19874b, inAppMessageComponentImpl.f19875c));
            inAppMessageComponentImpl.f19879g = DoubleCheck.a(new CardBindingWrapper_Factory(inAppMessageComponentImpl.f19873a, inAppMessageComponentImpl.f19874b, inAppMessageComponentImpl.f19875c));
            return inAppMessageComponentImpl;
        }

        private Builder() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class InAppMessageComponentImpl implements InAppMessageComponent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Provider f19873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Provider f19874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public InflaterModule_ProvidesBannerMessageFactory f19875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Provider f19876d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Provider f19877e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Provider f19878f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Provider f19879g;

        @Override // com.google.firebase.inappmessaging.display.internal.injection.components.InAppMessageComponent
        public final ImageBindingWrapper a() {
            return (ImageBindingWrapper) this.f19876d.get();
        }

        @Override // com.google.firebase.inappmessaging.display.internal.injection.components.InAppMessageComponent
        public final CardBindingWrapper b() {
            return (CardBindingWrapper) this.f19879g.get();
        }

        @Override // com.google.firebase.inappmessaging.display.internal.injection.components.InAppMessageComponent
        public final BannerBindingWrapper c() {
            return (BannerBindingWrapper) this.f19878f.get();
        }

        @Override // com.google.firebase.inappmessaging.display.internal.injection.components.InAppMessageComponent
        public final ModalBindingWrapper d() {
            return (ModalBindingWrapper) this.f19877e.get();
        }
    }

    private DaggerInAppMessageComponent() {
    }
}
