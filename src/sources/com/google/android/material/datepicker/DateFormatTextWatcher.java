package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.lingodeer.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class DateFormatTextWatcher extends TextWatcherAdapter {
    public int H = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f14328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SimpleDateFormat f14330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CalendarConstraints f14331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f14333f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f14334t;

    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.material.datepicker.a] */
    public DateFormatTextWatcher(final String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f14329b = str;
        this.f14330c = simpleDateFormat;
        this.f14328a = textInputLayout;
        this.f14331d = calendarConstraints;
        this.f14332e = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.f14333f = new Runnable() { // from class: com.google.android.material.datepicker.a
            @Override // java.lang.Runnable
            public final void run() {
                DateFormatTextWatcher dateFormatTextWatcher = this.f14432a;
                TextInputLayout textInputLayout2 = dateFormatTextWatcher.f14328a;
                SimpleDateFormat simpleDateFormat2 = dateFormatTextWatcher.f14330c;
                Context context = textInputLayout2.getContext();
                textInputLayout2.setError(w4.c.h(context.getString(R.string.mtrl_picker_invalid_format), "\n", String.format(context.getString(R.string.mtrl_picker_invalid_format_use), str.replace(' ', (char) 160)), "\n", String.format(context.getString(R.string.mtrl_picker_invalid_format_example), simpleDateFormat2.format(new Date(UtcDates.f().getTimeInMillis())).replace(' ', (char) 160))));
                dateFormatTextWatcher.a();
            }
        };
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) || editable.length() == 0) {
            return;
        }
        int length = editable.length();
        String str = this.f14329b;
        if (length >= str.length() || editable.length() < this.H) {
            return;
        }
        char cCharAt = str.charAt(editable.length());
        if (Character.isLetterOrDigit(cCharAt)) {
            return;
        }
        editable.append(cCharAt);
    }

    public abstract void b(Long l9);

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        this.H = charSequence.length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.google.android.material.datepicker.b, java.lang.Runnable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        CalendarConstraints calendarConstraints = this.f14331d;
        TextInputLayout textInputLayout = this.f14328a;
        a aVar = this.f14333f;
        textInputLayout.removeCallbacks(aVar);
        textInputLayout.removeCallbacks(this.f14334t);
        textInputLayout.setError(null);
        b(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.f14329b.length()) {
            return;
        }
        try {
            Date date = this.f14330c.parse(charSequence.toString());
            textInputLayout.setError(null);
            final long time = date.getTime();
            if (calendarConstraints.f14302c.L0(time)) {
                Calendar calendarC = UtcDates.c(calendarConstraints.f14300a.f14397a);
                calendarC.set(5, 1);
                if (calendarC.getTimeInMillis() <= time) {
                    Month month = calendarConstraints.f14301b;
                    int i14 = month.f14401e;
                    Calendar calendarC2 = UtcDates.c(month.f14397a);
                    calendarC2.set(5, i14);
                    if (time <= calendarC2.getTimeInMillis()) {
                        b(Long.valueOf(date.getTime()));
                        return;
                    }
                }
            }
            ?? r9 = new Runnable() { // from class: com.google.android.material.datepicker.b
                @Override // java.lang.Runnable
                public final void run() {
                    String strB = DateStrings.b(time);
                    DateFormatTextWatcher dateFormatTextWatcher = this.f14434a;
                    dateFormatTextWatcher.f14328a.setError(String.format(dateFormatTextWatcher.f14332e, strB.replace(' ', (char) 160)));
                    dateFormatTextWatcher.a();
                }
            };
            this.f14334t = r9;
            textInputLayout.post(r9);
        } catch (ParseException unused) {
            textInputLayout.post(aVar);
        }
    }

    public void a() {
    }
}
