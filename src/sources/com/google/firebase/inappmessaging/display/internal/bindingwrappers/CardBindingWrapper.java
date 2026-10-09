package com.google.firebase.inappmessaging.display.internal.bindingwrappers;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;
import com.google.firebase.inappmessaging.display.internal.layout.BaseModalLayout;
import com.google.firebase.inappmessaging.display.internal.layout.FiamCardView;
import com.google.firebase.inappmessaging.model.Action;
import com.google.firebase.inappmessaging.model.CardMessage;
import com.google.firebase.inappmessaging.model.InAppMessage;
import com.google.firebase.inappmessaging.model.MessageType;
import com.google.firebase.inappmessaging.model.Text;
import com.lingodeer.R;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CardBindingWrapper extends BindingWrapper {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FiamCardView f19822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BaseModalLayout f19823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ScrollView f19824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f19825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f19826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f19827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f19828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f19829k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CardMessage f19830l;
    public View.OnClickListener m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ScrollViewAdjustableListener f19831n;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class ScrollViewAdjustableListener implements ViewTreeObserver.OnGlobalLayoutListener {
        public ScrollViewAdjustableListener() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            CardBindingWrapper.this.f19827i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper
    public final InAppMessageLayoutConfig a() {
        return this.f19820b;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper
    public final View b() {
        return this.f19823e;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper
    public final View.OnClickListener c() {
        return this.m;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper
    public final ImageView d() {
        return this.f19827i;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper
    public final ViewGroup e() {
        return this.f19822d;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper
    public final ViewTreeObserver.OnGlobalLayoutListener f(HashMap map, View.OnClickListener onClickListener) {
        com.google.firebase.inappmessaging.model.Button button;
        String str;
        View viewInflate = this.f19821c.inflate(R.layout.card, (ViewGroup) null);
        this.f19824f = (ScrollView) viewInflate.findViewById(R.id.body_scroll);
        this.f19825g = (Button) viewInflate.findViewById(R.id.primary_button);
        this.f19826h = (Button) viewInflate.findViewById(R.id.secondary_button);
        this.f19827i = (ImageView) viewInflate.findViewById(R.id.image_view);
        this.f19828j = (TextView) viewInflate.findViewById(R.id.message_body);
        this.f19829k = (TextView) viewInflate.findViewById(R.id.message_title);
        this.f19822d = (FiamCardView) viewInflate.findViewById(R.id.card_root);
        this.f19823e = (BaseModalLayout) viewInflate.findViewById(R.id.card_content_root);
        InAppMessage inAppMessage = this.f19819a;
        if (inAppMessage.f20321a.equals(MessageType.CARD)) {
            CardMessage cardMessage = (CardMessage) inAppMessage;
            Text text = cardMessage.f20301d;
            this.f19830l = cardMessage;
            this.f19829k.setText(text.f20336a);
            this.f19829k.setTextColor(Color.parseColor(text.f20337b));
            Text text2 = cardMessage.f20302e;
            if (text2 == null || (str = text2.f20336a) == null) {
                this.f19824f.setVisibility(8);
                this.f19828j.setVisibility(8);
            } else {
                this.f19824f.setVisibility(0);
                this.f19828j.setVisibility(0);
                this.f19828j.setText(str);
                this.f19828j.setTextColor(Color.parseColor(text2.f20337b));
            }
            CardMessage cardMessage2 = this.f19830l;
            if (cardMessage2.f20306i == null && cardMessage2.f20307j == null) {
                this.f19827i.setVisibility(8);
            } else {
                this.f19827i.setVisibility(0);
            }
            CardMessage cardMessage3 = this.f19830l;
            Action action = cardMessage3.f20304g;
            Action action2 = cardMessage3.f20305h;
            BindingWrapper.h(this.f19825g, action.f20274b);
            Button button2 = this.f19825g;
            View.OnClickListener onClickListener2 = (View.OnClickListener) map.get(action);
            if (button2 != null) {
                button2.setOnClickListener(onClickListener2);
            }
            this.f19825g.setVisibility(0);
            if (action2 == null || (button = action2.f20274b) == null) {
                this.f19826h.setVisibility(8);
            } else {
                BindingWrapper.h(this.f19826h, button);
                Button button3 = this.f19826h;
                View.OnClickListener onClickListener3 = (View.OnClickListener) map.get(action2);
                if (button3 != null) {
                    button3.setOnClickListener(onClickListener3);
                }
                this.f19826h.setVisibility(0);
            }
            ImageView imageView = this.f19827i;
            InAppMessageLayoutConfig inAppMessageLayoutConfig = this.f19820b;
            imageView.setMaxHeight(inAppMessageLayoutConfig.a());
            this.f19827i.setMaxWidth(inAppMessageLayoutConfig.b());
            this.m = onClickListener;
            this.f19822d.setDismissListener(onClickListener);
            BindingWrapper.g(this.f19823e, this.f19830l.f20303f);
        }
        return this.f19831n;
    }
}
