package com.google.firebase.inappmessaging.display.internal.bindingwrappers;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;
import com.google.firebase.inappmessaging.display.internal.ResizableImageView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamFrameLayout;
import com.google.firebase.inappmessaging.model.BannerMessage;
import com.google.firebase.inappmessaging.model.ImageData;
import com.google.firebase.inappmessaging.model.InAppMessage;
import com.google.firebase.inappmessaging.model.MessageType;
import com.google.firebase.inappmessaging.model.Text;
import com.lingodeer.R;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class BannerBindingWrapper extends BindingWrapper {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FiamFrameLayout f19810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewGroup f19811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f19812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ResizableImageView f19813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f19814h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View.OnClickListener f19815i;

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper
    public final InAppMessageLayoutConfig a() {
        return this.f19820b;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper
    public final View b() {
        return this.f19811e;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper
    public final View.OnClickListener c() {
        return this.f19815i;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper
    public final ImageView d() {
        return this.f19813g;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper
    public final ViewGroup e() {
        return this.f19810d;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper
    public final ViewTreeObserver.OnGlobalLayoutListener f(HashMap map, View.OnClickListener onClickListener) {
        View viewInflate = this.f19821c.inflate(R.layout.banner, (ViewGroup) null);
        this.f19810d = (FiamFrameLayout) viewInflate.findViewById(R.id.banner_root);
        this.f19811e = (ViewGroup) viewInflate.findViewById(R.id.banner_content_root);
        this.f19812f = (TextView) viewInflate.findViewById(R.id.banner_body);
        this.f19813g = (ResizableImageView) viewInflate.findViewById(R.id.banner_image);
        this.f19814h = (TextView) viewInflate.findViewById(R.id.banner_title);
        InAppMessage inAppMessage = this.f19819a;
        if (inAppMessage.f20321a.equals(MessageType.BANNER)) {
            BannerMessage bannerMessage = (BannerMessage) inAppMessage;
            String str = bannerMessage.f20288h;
            Text text = bannerMessage.f20285e;
            Text text2 = bannerMessage.f20284d;
            if (!TextUtils.isEmpty(str)) {
                BindingWrapper.g(this.f19811e, str);
            }
            ResizableImageView resizableImageView = this.f19813g;
            ImageData imageData = bannerMessage.f20286f;
            resizableImageView.setVisibility((imageData == null || TextUtils.isEmpty(imageData.f20315a)) ? 8 : 0);
            if (text2 != null) {
                String str2 = text2.f20337b;
                String str3 = text2.f20336a;
                if (!TextUtils.isEmpty(str3)) {
                    this.f19814h.setText(str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    this.f19814h.setTextColor(Color.parseColor(str2));
                }
            }
            if (text != null) {
                String str4 = text.f20337b;
                String str5 = text.f20336a;
                if (!TextUtils.isEmpty(str5)) {
                    this.f19812f.setText(str5);
                }
                if (!TextUtils.isEmpty(str4)) {
                    this.f19812f.setTextColor(Color.parseColor(str4));
                }
            }
            InAppMessageLayoutConfig inAppMessageLayoutConfig = this.f19820b;
            int iMin = Math.min(inAppMessageLayoutConfig.f19777d.intValue(), inAppMessageLayoutConfig.f19776c.intValue());
            ViewGroup.LayoutParams layoutParams = this.f19810d.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            }
            layoutParams.width = iMin;
            this.f19810d.setLayoutParams(layoutParams);
            this.f19813g.setMaxHeight(inAppMessageLayoutConfig.a());
            this.f19813g.setMaxWidth(inAppMessageLayoutConfig.b());
            this.f19815i = onClickListener;
            this.f19810d.setDismissListener(onClickListener);
            this.f19811e.setOnClickListener((View.OnClickListener) map.get(bannerMessage.f20287g));
        }
        return null;
    }
}
