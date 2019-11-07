$(function () {
    $('#grid').datagrid({
        url:'orders_listByPage.do',
        columns:[[
            {field:'id',title:'编号',width:100},
            {field:'createtime',title:'生成日期',width:100},
            {field:'checktime',title:'审核日期',width:100},
            {field:'starttime',title:'确认日期',width:100},
            {field:'endtime',title:'入库日期',width:100},
            {field:'creater',title:'下单员',width:100},
            {field:'checker',title:'审核员',width:100},
            {field:'starter',title:'采购员',width:100},
            {field:'ender',title:'库管员',width:100},
            {field:'supplierid',title:'供应商或客户',width:100},
            {field:'totalmoney',title:'合计金额',width:100},
            {field:'state',title:'状态',width:100,formatter:getState},
            {field:'waybillsn',title:'运单号',width:100},

            {field:'-',title:'操作',width:200,formatter: function(value,row,index){
                    var oper = "<a href=\"javascript:void(0)\" onclick=\"edit(" + row.id + ')">修改</a>';
                    oper += ' <a href="javascript:void(0)" onclick="del(' + row.id + ')">删除</a>';
                    return oper;
                }}
        ]],
        singleSelect:true,
        pagination:true,
        fitColumns:true,
        toolbar: [{
            text: '新增',
            iconCls: 'icon-add',
            handler: function(){
                //设置保存按钮提交的方法为add
                method = "add";
                //关闭编辑窗口
                $('#editDlg').dialog('open');
            }
        }]
    });
})

/**
 * 获取订单的状态
 * @param value
 * @returns
 * 采购: 0:未审核 1:已审核, 2:已确认, 3:已入库
 */
function getState(value){
    switch(value * 1){
        case 0:return '未审核';
        case 1:return '已审核';
        case 2:return '已确认';
        case 3:return '已入库';
        default: return '';
    }
}

