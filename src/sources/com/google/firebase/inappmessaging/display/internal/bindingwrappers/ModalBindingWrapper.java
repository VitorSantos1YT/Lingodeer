package com.google.firebase.inappmessaging.display.internal.bindingwrappers;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;
import com.google.firebase.inappmessaging.display.internal.layout.FiamRelativeLayout;
import com.google.firebase.inappmessaging.model.Action;
import com.google.firebase.inappmessaging.model.ImageData;
import com.google.firebase.inappmessaging.model.InAppMessage;
import com.google.firebase.inappmessaging.model.MessageType;
import com.google.firebase.inappmessaging.model.ModalMessage;
import com.google.firebase.inappmessaging.model.Text;
import com.lingodeer.R;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ModalBindingWrapper extends BindingWrapper {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FiamRelativeLayout f19843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewGroup f19844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ScrollView f19845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f19846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f19847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f19848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f19849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f19850k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ModalMessage f19851l;
    public ScrollViewAdjustableListener m;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class ScrollViewAdjustableListener implements ViewTreeObserver.OnGlobalLayoutListener {
        public ScrollViewAdjustableListener() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ModalBindingWrapper.this.f19848i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper
    public final InAppMessageLayoutConfig a() {
        return this.f19820b;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper
    public final View b() {
        return this.f19844e;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper
    public final ImageView d() {
        return this.f19848i;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper
    public final ViewGroup e() {
        return this.f19843d;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00df  */
    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper
    public final ViewTreeObserver.OnGlobalLayoutListener f(HashMap map, View.OnClickListener onClickListener) {
        com.google.firebase.inappmessaging.model.Button button;
        View viewInflate = this.f19821c.inflate(R.layout.modal, (ViewGroup) null);
        this.f19845f = (ScrollView) viewInflate.findViewById(R.id.body_scroll);
        this.f19846g = (Button) viewInflate.findViewById(R.id.button);
        this.f19847h = viewInflate.findViewById(R.id.collapse_button);
        this.f19848i = (ImageView) viewInflate.findViewById(R.id.image_view);
        this.f19849j = (TextView) viewInflate.findViewById(R.id.message_body);
        this.f19850k = (TextView) viewInflate.findViewById(R.id.message_title);
        this.f19843d = (FiamRelativeLayout) viewInflate.findViewById(R.id.modal_root);
        this.f19844e = (ViewGroup) viewInflate.findViewById(R.id.modal_content_root);
        InAppMessage inAppMessage = this.f19819a;
        if (inAppMessage.f20321a.equals(MessageType.MODAL)) {
            ModalMessage modalMessage = (ModalMessage) inAppMessage;
            this.f19851l = modalMessage;
            ImageData imageData = modalMessage.f20326f;
            Text text = modalMessage.f20325e;
            Text text2 = modalMessage.f20324d;
            if (imageData == null || TextUtils.isEmpty(imageData.f20315a)) {
                this.f19848i.setVisibility(8);
            } else {
                this.f19848i.setVisibility(0);
            }
            if (text2 != null) {
                String str = text2.f20337b;
                String str2 = text2.f20336a;
                if (TextUtils.isEmpty(str2)) {
                    this.f19850k.setVisibility(8);
                } else {
                    this.f19850k.setVisibility(0);
                    this.f19850k.setText(str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    this.f19850k.setTextColor(Color.parseColor(str));
                }
            }
            if (text != null) {
                String str3 = text.f20336a;
                if (TextUtils.isEmpty(str3)) {
                    this.f19845f.setVisibility(8);
                    this.f19849j.setVisibility(8);
                } else {
                    this.f19845f.setVisibility(0);
                    this.f19849j.setVisibility(0);
                    this.f19849j.setTextColor(Color.parseColor(text.f20337b));
                    this.f19849j.setText(str3);
                }
            } else {
                this.f19845f.setVisibility(8);
                this.f19849j.setVisibility(8);
            }
            Action action = this.f19851l.f20327g;
            if (action == null || (button = action.f20274b) == null || TextUtils.isEmpty(button.f20294a.f20336a)) {
                this.f19846g.setVisibility(8);
            } else {
                BindingWrapper.h(this.f19846g, button);
                Button button2 = this.f19846g;
                View.OnClickListener onClickListener2 = (View.OnClickListener) map.get(this.f19851l.f20327g);
                if (button2 != null) {
                    button2.setOnClickListener(onClickListener2);
                }
                this.f19846g.setVisibility(0);
            }
            ImageView imageView = this.f19848i;
            InAppMessageLayoutConfig inAppMessageLayoutConfig = this.f19820b;
            imageView.setMaxHeight(inAppMessageLayoutConfig.a());
            this.f19848i.setMaxWidth(inAppMessageLayoutConfig.b());
            this.f19847h.setOnClickListener(onClickListener);
            this.f19843d.setDismissListener(onClickListener);
            BindingWrapper.g(this.f19844e, this.f19851l.f20328h);
        }
        return this.m;
    }
}
