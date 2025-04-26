export default {
	baseUrl: 'http://localhost:8080/springboots7972bmp/',
	name: '/springboots7972bmp',
	indexNav: [
		{
			name: '岗位信息',
			url: '/index/gangweixinxi',
		},
		{
			name: '公告信息',
			url: '/index/news'
		},
		{
			name: '意见反馈',
			url: '/index/messages'
		},
	],
	cateList: [
		{
			name: '公告信息',
			refTable: 'newstype',
			refColumn: 'typename',
		},
	]
}
