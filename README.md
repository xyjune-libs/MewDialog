# MewDialog

<img src="https://github.com/xyjune-libs/MewDialog/blob/master/documents/demo.jpg">

## 使用方法
```Java
public void showDialog(View view) {
    new MewDialog(this)
            .setTitle("MewDialog")
            .setContentImg(R.mipmap.ic_launcher)
            .setContent("是否好用？")
            .setButtonText("不好", "好用")
            .setButtonListener(new BaseAlertDialog.OnLeftClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "不好用别用!", Toast.LENGTH_SHORT).show();
                }
            }, new BaseAlertDialog.OnRightClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "谢谢使用!", Toast.LENGTH_SHORT).show();
                }
            })
            .show();
}
```