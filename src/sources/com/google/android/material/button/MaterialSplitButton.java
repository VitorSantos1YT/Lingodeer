package com.google.android.material.button;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialSplitButton extends MaterialButtonGroup {
    public MaterialSplitButton(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.button.MaterialButtonGroup, android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            throw new IllegalArgumentException("MaterialSplitButton can only hold MaterialButtons.");
        }
        if (getChildCount() > 2) {
            throw new IllegalArgumentException("MaterialSplitButton can only hold two MaterialButtons.");
        }
        MaterialButton materialButton = (MaterialButton) view;
        super.addView(view, i11, layoutParams);
        if (indexOfChild(view) == 1) {
            materialButton.setCheckable(true);
            materialButton.setA11yClassName(Button.class.getName());
            if (Build.VERSION.SDK_INT >= 30) {
                materialButton.setStateDescription(getResources().getString(materialButton.Q ? R.string.mtrl_button_expanded_content_description : R.string.mtrl_button_collapsed_content_description));
                materialButton.f14055e.add(new MaterialButton.OnCheckedChangeListener() { // from class: com.google.android.material.button.b
                    @Override // com.google.android.material.button.MaterialButton.OnCheckedChangeListener
                    public final void a(MaterialButton materialButton2, boolean z11) {
                        materialButton2.setStateDescription(this.f14100a.getResources().getString(z11 ? R.string.mtrl_button_expanded_content_description : R.string.mtrl_button_collapsed_content_description));
                    }
                });
            }
        }
    }

    public MaterialSplitButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSplitButtonStyle);
    }

    public MaterialSplitButton(Context context, AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, R.style.Widget_Material3_MaterialSplitButton), attributeSet, i11);
    }
}
