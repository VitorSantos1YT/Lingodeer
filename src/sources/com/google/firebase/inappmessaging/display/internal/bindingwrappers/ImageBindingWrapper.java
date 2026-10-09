package com.google.firebase.inappmessaging.display.internal.bindingwrappers;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;
import com.google.firebase.inappmessaging.display.internal.layout.FiamFrameLayout;
import com.google.firebase.inappmessaging.model.ImageData;
import com.google.firebase.inappmessaging.model.ImageOnlyMessage;
import com.google.firebase.inappmessaging.model.InAppMessage;
import com.google.firebase.inappmessaging.model.MessageType;
import com.lingodeer.R;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ImageBindingWrapper extends BindingWrapper {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FiamFrameLayout f19836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewGroup f19837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f19838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f19839g;

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper
    public final View b() {
        return this.f19837e;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper
    public final ImageView d() {
        return this.f19838f;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper
    public final ViewGroup e() {
        return this.f19836d;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper
    public final ViewTreeObserver.OnGlobalLayoutListener f(HashMap map, View.OnClickListener onClickListener) {
        View viewInflate = this.f19821c.inflate(R.layout.image, (ViewGroup) null);
        this.f19836d = (FiamFrameLayout) viewInflate.findViewById(R.id.image_root);
        this.f19837e = (ViewGroup) viewInflate.findViewById(R.id.image_content_root);
        this.f19838f = (ImageView) viewInflate.findViewById(R.id.image_view);
        this.f19839g = (Button) viewInflate.findViewById(R.id.collapse_button);
        ImageView imageView = this.f19838f;
        InAppMessageLayoutConfig inAppMessageLayoutConfig = this.f19820b;
        imageView.setMaxHeight(inAppMessageLayoutConfig.a());
        this.f19838f.setMaxWidth(inAppMessageLayoutConfig.b());
        InAppMessage inAppMessage = this.f19819a;
        if (inAppMessage.f20321a.equals(MessageType.IMAGE_ONLY)) {
            ImageOnlyMessage imageOnlyMessage = (ImageOnlyMessage) inAppMessage;
            ImageView imageView2 = this.f19838f;
            ImageData imageData = imageOnlyMessage.f20317d;
            imageView2.setVisibility((imageData == null || TextUtils.isEmpty(imageData.f20315a)) ? 8 : 0);
            this.f19838f.setOnClickListener((View.OnClickListener) map.get(imageOnlyMessage.f20318e));
        }
        this.f19836d.setDismissListener(onClickListener);
        this.f19839g.setOnClickListener(onClickListener);
        return null;
    }
}
